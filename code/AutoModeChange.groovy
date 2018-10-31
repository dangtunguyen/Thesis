preferences {
    section("When all of these people leave home") {
        input "people", "capability.presenceSensor",
        multiple: true
    }
    section("Change to this mode") {
        input "newMode1", "mode", title: "Mode?"
    }
    section("Change to this mode when any of them"
            "come back home") {
        input "newMode2", "mode", title: "Mode?"
    }
    
}
def installed() {
    subscribe(people, "presence", presence)
}
def updated() {
    unsubscribe()
    subscribe(people, "presence", presence)
}
def presence(evt)
{
    if (evt.value == "not present") {
        if (location.mode != newMode1) {
            if (everyoneIsAway()) {
                setLocationMode(newMode1)
            }
        }
    }
    else {
        if (location.mode != newMode2) {
            setLocationMode(newMode2)
        }
    }
}
private everyoneIsAway()
{
    def result = true
    for (person in people) {
        if (person.currentPresence == "present") {
            result = false
            break
        }
    }
    return result
}