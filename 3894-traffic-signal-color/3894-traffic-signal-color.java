class Solution {
    public String trafficSignal(int timer) {
        String signal = "";

        if(timer == 0) {
            signal = "Green";
        }
        else if(timer == 30) {
            signal = "Orange";
        }
        else if(timer > 30 && timer <= 90) {
            signal = "Red";
        }

        else {
            signal = "Invalid";
        }

        return signal;
    }
}