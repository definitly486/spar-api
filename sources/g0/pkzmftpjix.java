package g0;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class pkzmftpjix implements Comparator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final pkzmftpjix f35739zdlpuopuiu = new pkzmftpjix();

    private pkzmftpjix() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compare(gg.vdvldrhtss vdvldrhtssVar, gg.vdvldrhtss vdvldrhtssVar2) {
        int iCompare = Float.compare(((g.lqeggnwhkg) vdvldrhtssVar.lqeggnwhkg()).gtknphoqwx(), ((g.lqeggnwhkg) vdvldrhtssVar2.lqeggnwhkg()).gtknphoqwx());
        return iCompare != 0 ? iCompare : Float.compare(((g.lqeggnwhkg) vdvldrhtssVar.lqeggnwhkg()).eablkybsjg(), ((g.lqeggnwhkg) vdvldrhtssVar2.lqeggnwhkg()).eablkybsjg());
    }
}
