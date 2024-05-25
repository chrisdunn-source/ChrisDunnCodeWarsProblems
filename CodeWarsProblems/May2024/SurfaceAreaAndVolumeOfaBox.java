public class SurfaceAreaAndVolumeOfaBox {
    public static int[] getSize(int w, int h, int d) {
        int[] result = new int[2];
        
        // Calculate total surface area
        int area = 2 * (w * h + h * d + d * w);
        
        // Calculate volume
        int volume = w * h * d;
        
        result[0] = area;
        result[1] = volume;
        
        return result;
    }
}
