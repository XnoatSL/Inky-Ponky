public class inky {
    public inky(String pinky){
        System.out.println(pinky);
    }

    public inky(String pinky, String blinky, String rinky){
        System.out.println(blinky+" "+ pinky);
        System.out.println(pinky+" "+rinky);
        System.out.println(blinky+" "+pinky+" "+rinky);
    }

    public static void main(String[] args) {
        String pinky ="donkey";
        String blinky ="pinky";
        String rinky ="monkey";

        inky ponky= new inky(pinky);
        inky poInky2 = new inky(pinky, blinky, rinky);
    }
} 