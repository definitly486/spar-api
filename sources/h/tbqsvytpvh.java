package h;

import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
final class tbqsvytpvh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final tbqsvytpvh f38968iobyxmoadg = new tbqsvytpvh();

    private tbqsvytpvh() {
    }

    public static final ColorSpace iobyxmoadg(i.ppxfxbqfkf ppxfxbqfkfVar) {
        i.gtknphoqwx gtknphoqwxVar = i.gtknphoqwx.f41496iobyxmoadg;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.vdvldrhtss())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_HLG);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, gtknphoqwxVar.oxmwwwfdhm())) {
            return ColorSpace.get(ColorSpace.Named.BT2020_PQ);
        }
        return null;
    }
}
