package gxszxtbevo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class ppxfxbqfkf extends iobyxmoadg {
    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public final iobyxmoadg.C0890iobyxmoadg zoijcleaow(Context context, String[] input) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(input, "input");
        return null;
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public final Uri ppxfxbqfkf(int i13, Intent intent) {
        if (i13 != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Intent iobyxmoadg(Context context, String[] input) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(input, "input");
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
        zdlpuopuiu.dxjokdxxww(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
        return type;
    }
}
