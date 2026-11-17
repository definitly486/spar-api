package rg;

import java.io.File;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String zoijcleaow(File file, File file2, String str) {
        StringBuilder sb3 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb3.append(" -> " + file2);
        }
        if (str != null) {
            sb3.append(": " + str);
        }
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        return string;
    }
}
