public class AutoModeChange {
    STLocation location;
    STPresSensor[] AutoModeChange_people;
    int AutoModeChange_newMode1;
    int AutoModeChange_newMode2;
    
    public void presenceEvtHandler(STEvent evt) {
        if(evt.value == 18) {
            if(location.mode != AutoModeChange_newMode1) {
                if(everyoneIsAway()) {
                    setLocationMode(AutoModeChange_newMode1);
                } else { }
            } else { }
        } else {
            if(location.mode != AutoModeChange_newMode2) {
                setLocationMode(AutoModeChange_newMode2);
            } else { }
        }
    }
    private boolean everyoneIsAway() {
        boolean result = true;
        int index0 = 0 ;
        while(index0 < AutoModeChange_people.length) {
            STPresSensor person = AutoModeChange_people[index0];
            if(person.currentPresence == 19 ) {
                result = false;
                break;
            } else { }
            index0 ++;
        }
        return result;
    }
    public void setLocationMode(int mode){
        if(mode == 1400) /* HOME */
        {
            location.STCommand_Location_Home = true;
        }
        else if(mode == 1401) /* AWAY */
        {
            location.STCommand_Location_Away = true;
        }
        else if(mode == 1402) /* NIGHT */
        {
            location.STCommand_Location_Night = true;
        }
    }
}