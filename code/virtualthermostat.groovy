preferences {
  section("Choose a temperature sensor... "){
    input "sensor", "capability.temperatureMeasurement", title: "Sensor"
  }
  section("Select the heater or air conditioner outlet(s)... "){
    input "outlets", "capability.switch", title: "Outlets", multiple: true
  }
  section("Set the desired temperature..."){
    input "setpoint", "decimal", title: "Set Temp"
  }
  section("When there's been movement from (optional)"){
    input "motion", "capability.motionSensor", title: "Motion", required: false
  }
  section("Within this number of minutes..."){
    input "minutes", "number", title: "Minutes", required: false
  }
  section("But never go below (or above if A/C) this value with or without motion..."){
    input "emergencySetpoint", "decimal", title: "Emer Temp", required: false
  }
  section("Select 'heat' for a heater and 'cool' for an air conditioner..."){
    input "mode", "enum", title: "Heating or cooling?", options: ["heat","cool"]
  }
}
