class Cylinder
{
    private double radius, height, area, volume;

    public Cylinder(double height, double radius) {
        radius = 0.0;
        height = 0.0;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        double area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
        return area;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double calcVolume() {
        double volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }

    public String toString (){
        StringBuilder StBuild = new StringBuilder();
        StBuild.append(radius).append(height);
        return StBuild.toString();
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(5, 5);
        System.out.println(cylinder1);
    }
}