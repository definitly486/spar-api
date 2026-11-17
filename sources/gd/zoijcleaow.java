package gd;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static String iobyxmoadg(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", wkgbmnqykc(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    public static String ppxfxbqfkf(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", wkgbmnqykc(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    private static String wkgbmnqykc(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }

    public static String zoijcleaow(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", wkgbmnqykc(str, str2), "perf-android-sdk", "android-ide");
    }
}
