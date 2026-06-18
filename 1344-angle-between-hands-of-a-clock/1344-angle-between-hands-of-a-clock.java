class Solution {
    public double angleClock(int hour, int minutes) {
        
        double minAngle = minutes * 6;
        double hourAngle = (hour*30) + (minutes * 0.5);

        double difference = Math.abs(hourAngle - minAngle);
        return Math.min(difference, 360-difference);
    }
}