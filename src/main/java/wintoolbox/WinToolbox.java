package wintoolbox;

public class WinToolbox {
    static {
        System.loadLibrary("WinToolbox");
    }

    public static native boolean ChangeVolume(double nVolume, boolean bScalar);

    public static native double GetCurVolume(boolean bScalar);
}
