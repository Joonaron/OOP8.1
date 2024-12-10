package Assignment81.task1;

public class Pen {
    private Color color;
    private boolean isCapped;
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");

        private final String color;



        Color(String color) {
            this.color = color;
        };

        @Override
        public String toString() { return color; }

    }


    public Pen(){
        this.color = Color.RED;
        this.isCapped = true;

    }
    public Pen(Color color){
        this.color = color;
        this.isCapped = true;
    }
    public void changeColor(Color newColor){
        if(isCapped){
            this.color = newColor;
        }

    }

    public void capOff(){
        isCapped = false;
    }

    public void capOn(){
        isCapped = true;
    }

    public String draw(){
        if (isCapped){
            return "";

        }else {
            return "Drawing" + " " + color;
        }
    }

}