private STSwitch[] onSwitches(){
  STSwitch[] STSwitchArr0;
  int arrIndex0 = 0;
  int index3 = 0;
  while(index3 < TheBigSwitch_switches.length){
    STSwitch it = TheBigSwitch_switches[index3];
    STSwitchArr0[arrIndex0] = it;
    arrIndex0++;
    index3++;
  }
  int index4 = 0;
  while(index4 < TheBigSwitch_onSwitches.length){
    STSwitch it = TheBigSwitch_onSwitches[index4];
    STSwitchArr0[arrIndex0] = it;
    arrIndex0++;
    index4++;
  }
  return STSwitchArr0;
}