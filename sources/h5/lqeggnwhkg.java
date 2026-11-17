package h5;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Uri f39424iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final String f39425ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f39426zoijcleaow;

    public lqeggnwhkg(Uri uri, String str, String str2) {
        this.f39424iobyxmoadg = uri;
        this.f39426zoijcleaow = str;
        this.f39425ppxfxbqfkf = str2;
    }

    public String iobyxmoadg() {
        return this.f39426zoijcleaow;
    }

    public Uri ppxfxbqfkf() {
        return this.f39424iobyxmoadg;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("NavDeepLinkRequest");
        sb3.append("{");
        if (ppxfxbqfkf() != null) {
            sb3.append(" uri=");
            sb3.append(String.valueOf(ppxfxbqfkf()));
        }
        if (iobyxmoadg() != null) {
            sb3.append(" action=");
            sb3.append(iobyxmoadg());
        }
        if (zoijcleaow() != null) {
            sb3.append(" mimetype=");
            sb3.append(zoijcleaow());
        }
        sb3.append(" }");
        String string = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string, "sb.toString()");
        return string;
    }

    public String zoijcleaow() {
        return this.f39425ppxfxbqfkf;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lqeggnwhkg(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        zdlpuopuiu.btonecajqb(intent, "intent");
    }
}
