public class SmartDevice {
    /*
        A smart device can be initialized in multiple stages depending on the information available at the time of creation.
        Class Name: SmartDevice
        Instance Variables
            •	String deviceName
            •	String os
            •	int batteryCapacity
        Constructor Requirements
        Implement the following constructors using constructor chaining with this():
            1.	Default constructor
            •	Initializes the device with default values.
            2.	Constructor with deviceName
            •	Initializes the device name and uses constructor chaining.
            3.	Constructor with deviceName and os
            •	Initializes device name and operating system using constructor chaining.
            4.	Constructor with all fields (deviceName, os, batteryCapacity)
            •	Initializes all instance variables.
    */

        String deviceName,os;
        int batteryCapacity;

        public SmartDevice(){
            // deviceName="zomba robot";
            // os = "16";
            // batteryCapacity=86;
        }

        public SmartDevice(String deviceName){
            this();
            this.deviceName=deviceName;
        }
        public SmartDevice(String deviceName, String os){
            this();
            this.deviceName= deviceName;
            this.os=os;
        }
        public SmartDevice(String deviceName, String os,int batteryCapacity){
            this.deviceName= deviceName;
            this.os=os;
            this.batteryCapacity=batteryCapacity;
        }

        public static void main(String[] args){

            SmartDevice ref1 = new SmartDevice("Zomba Robot");
            System.out.println(ref1.deviceName);
            System.out.println(ref1.os);
            System.out.println(ref1.batteryCapacity);

            SmartDevice ref2 = new SmartDevice("Laptop","MacOs");
            System.out.println(ref2.deviceName);
            System.out.println(ref2.os);
            System.out.println(ref2.batteryCapacity);

            SmartDevice ref3 = new SmartDevice("Computer","Linux",86);
            System.out.println(ref3.deviceName);
            System.out.println(ref3.os);
            System.out.println(ref3.batteryCapacity);
        }



}
