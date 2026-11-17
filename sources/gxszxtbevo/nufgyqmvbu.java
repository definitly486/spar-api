package gxszxtbevo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu extends iobyxmoadg {
    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public final iobyxmoadg.C0890iobyxmoadg zoijcleaow(Context context, Uri input) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(input, "input");
        return null;
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public final Boolean ppxfxbqfkf(int i13, Intent intent) {
        return Boolean.valueOf(i13 == -1);
    }

    @Override // gxszxtbevo.iobyxmoadg
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Intent iobyxmoadg(Context context, Uri input) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(input, "input");
        Intent intentPutExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
        zdlpuopuiu.dxjokdxxww(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return intentPutExtra;
    }
}
