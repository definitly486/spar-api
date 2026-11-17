package c2;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class iobyxmoadg {
    public static final File iobyxmoadg(Context context, String fileName) {
        zdlpuopuiu.btonecajqb(context, "<this>");
        zdlpuopuiu.btonecajqb(fileName, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), zdlpuopuiu.oxmwwwfdhm("datastore/", fileName));
    }
}
