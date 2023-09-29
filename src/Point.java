public class Point {
    private int x;
    private int y;

    public Point(int x) {
        this.x = x;
        y = x;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public String coordinate() {
        return "(" + x + ", " + y + ")";
    }


    public String quadrant() {
        if (x > 0 && y > 0) {
            return "I";
        } else if (x < 0 && y > 0) {
            return "II";
        } else if (x < 0 && y < 0) {
            return "III";
        } else if (x > 0 && y < 0) {
            return "VI";
        } else if (x == 0 && y == 0) {
            return "origin";
        } else if ((x == 0 && y < 0) || (x == 0 && y > 0)) {
            return "on the y-axis";
        } else if ((x > 0 && y == 0) || (x < 0 && y == 0)) {
            return "on the x-axis";
        }
        return "";
    }

// getter and setters
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

}

