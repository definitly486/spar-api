package u6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.zdlpuopuiu;
import l8.lqeggnwhkg;
import t8.dxjokdxxww;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements y8.eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f112747iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final iobyxmoadg f112748zoijcleaow;

    public zoijcleaow(Context context) {
        zdlpuopuiu.btonecajqb(context, "context");
        this.f112747iobyxmoadg = context;
        this.f112748zoijcleaow = new iobyxmoadg();
    }

    @Override // y8.eablkybsjg
    public n8.ppxfxbqfkf iobyxmoadg(n8.ppxfxbqfkf toTranscode, lqeggnwhkg options) {
        zdlpuopuiu.btonecajqb(toTranscode, "toTranscode");
        zdlpuopuiu.btonecajqb(options, "options");
        Object obj = this.f112748zoijcleaow.iobyxmoadg(toTranscode, options).get();
        zdlpuopuiu.dxjokdxxww(obj, "bitmapTranscoder.transco…Transcode, options).get()");
        return new dxjokdxxww(new BitmapDrawable(this.f112747iobyxmoadg.getResources(), (Bitmap) obj));
    }
}
