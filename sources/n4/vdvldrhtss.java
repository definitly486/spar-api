package n4;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.List;
import t3.ylkuphrtab;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class vdvldrhtss {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f68695ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final xa.ojitshcjhn f68693wkgbmnqykc = xa.ojitshcjhn.wkgbmnqykc(':');

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final xa.ojitshcjhn f68692eablkybsjg = xa.ojitshcjhn.wkgbmnqykc('*');

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f68694iobyxmoadg = new ArrayList();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private int f68696zoijcleaow = 0;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f68697iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final int f68698ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f68699zoijcleaow;

        public iobyxmoadg(int i13, long j13, int i14) {
            this.f68697iobyxmoadg = i13;
            this.f68699zoijcleaow = j13;
            this.f68698ppxfxbqfkf = i14;
        }
    }

    private void eablkybsjg(t3.vdvldrhtss vdvldrhtssVar, List list) throws ParserException {
        long position = vdvldrhtssVar.getPosition();
        int length = (int) ((vdvldrhtssVar.getLength() - vdvldrhtssVar.getPosition()) - ((long) this.f68695ppxfxbqfkf));
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(length);
        vdvldrhtssVar.readFully(yadqdtsiqtVar.eablkybsjg(), 0, length);
        for (int i13 = 0; i13 < this.f68694iobyxmoadg.size(); i13++) {
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f68694iobyxmoadg.get(i13);
            yadqdtsiqtVar.sopmlzcsov((int) (iobyxmoadgVar.f68699zoijcleaow - position));
            yadqdtsiqtVar.crxdokpmqz(4);
            int iYggfygwlhe = yadqdtsiqtVar.yggfygwlhe();
            int iZoijcleaow = zoijcleaow(yadqdtsiqtVar.yadqdtsiqt(iYggfygwlhe));
            int i14 = iobyxmoadgVar.f68698ppxfxbqfkf - (iYggfygwlhe + 8);
            if (iZoijcleaow == 2192) {
                list.add(gxszxtbevo(yadqdtsiqtVar, i14));
            } else if (iZoijcleaow != 2816 && iZoijcleaow != 2817 && iZoijcleaow != 2819 && iZoijcleaow != 2820) {
                throw new IllegalStateException();
            }
        }
    }

    private static i4.ppxfxbqfkf gxszxtbevo(yadqdtsiqt yadqdtsiqtVar, int i13) throws ParserException {
        ArrayList arrayList = new ArrayList();
        List listGxszxtbevo = f68692eablkybsjg.gxszxtbevo(yadqdtsiqtVar.yadqdtsiqt(i13));
        for (int i14 = 0; i14 < listGxszxtbevo.size(); i14++) {
            List listGxszxtbevo2 = f68693wkgbmnqykc.gxszxtbevo((CharSequence) listGxszxtbevo.get(i14));
            if (listGxszxtbevo2.size() != 3) {
                throw ParserException.iobyxmoadg(null, null);
            }
            try {
                arrayList.add(new i4.ppxfxbqfkf.iobyxmoadg(Long.parseLong((String) listGxszxtbevo2.get(0)), Long.parseLong((String) listGxszxtbevo2.get(1)), 1 << (Integer.parseInt((String) listGxszxtbevo2.get(2)) - 1)));
            } catch (NumberFormatException e13) {
                throw ParserException.iobyxmoadg(null, e13);
            }
        }
        return new i4.ppxfxbqfkf(arrayList);
    }

    private void iobyxmoadg(t3.vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(8);
        vdvldrhtssVar.readFully(yadqdtsiqtVar.eablkybsjg(), 0, 8);
        this.f68695ppxfxbqfkf = yadqdtsiqtVar.yggfygwlhe() + 8;
        if (yadqdtsiqtVar.vdvldrhtss() != 1397048916) {
            ylkuphrtabVar.f109571iobyxmoadg = 0L;
        } else {
            ylkuphrtabVar.f109571iobyxmoadg = vdvldrhtssVar.getPosition() - ((long) (this.f68695ppxfxbqfkf - 12));
            this.f68696zoijcleaow = 2;
        }
    }

    private void wkgbmnqykc(t3.vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar) {
        long length = vdvldrhtssVar.getLength();
        int i13 = this.f68695ppxfxbqfkf - 20;
        yadqdtsiqt yadqdtsiqtVar = new yadqdtsiqt(i13);
        vdvldrhtssVar.readFully(yadqdtsiqtVar.eablkybsjg(), 0, i13);
        for (int i14 = 0; i14 < i13 / 12; i14++) {
            yadqdtsiqtVar.crxdokpmqz(2);
            short sIwizpuwonk = yadqdtsiqtVar.iwizpuwonk();
            if (sIwizpuwonk == 2192 || sIwizpuwonk == 2816 || sIwizpuwonk == 2817 || sIwizpuwonk == 2819 || sIwizpuwonk == 2820) {
                this.f68694iobyxmoadg.add(new iobyxmoadg(sIwizpuwonk, (length - ((long) this.f68695ppxfxbqfkf)) - ((long) yadqdtsiqtVar.yggfygwlhe()), yadqdtsiqtVar.yggfygwlhe()));
            } else {
                yadqdtsiqtVar.crxdokpmqz(8);
            }
        }
        if (this.f68694iobyxmoadg.isEmpty()) {
            ylkuphrtabVar.f109571iobyxmoadg = 0L;
        } else {
            this.f68696zoijcleaow = 3;
            ylkuphrtabVar.f109571iobyxmoadg = ((iobyxmoadg) this.f68694iobyxmoadg.get(0)).f68699zoijcleaow;
        }
    }

    private static int zoijcleaow(String str) throws ParserException {
        str.hashCode();
        switch (str) {
            case "SlowMotion_Data":
                return 2192;
            case "Super_SlowMotion_Edit_Data":
                return 2819;
            case "Super_SlowMotion_Data":
                return 2816;
            case "Super_SlowMotion_Deflickering_On":
                return 2820;
            case "Super_SlowMotion_BGM":
                return 2817;
            default:
                throw ParserException.iobyxmoadg("Invalid SEF name", null);
        }
    }

    public void lqeggnwhkg() {
        this.f68694iobyxmoadg.clear();
        this.f68696zoijcleaow = 0;
    }

    public int ppxfxbqfkf(t3.vdvldrhtss vdvldrhtssVar, ylkuphrtab ylkuphrtabVar, List list) throws ParserException {
        int i13 = this.f68696zoijcleaow;
        long j13 = 0;
        if (i13 == 0) {
            long length = vdvldrhtssVar.getLength();
            if (length != -1 && length >= 8) {
                j13 = length - 8;
            }
            ylkuphrtabVar.f109571iobyxmoadg = j13;
            this.f68696zoijcleaow = 1;
        } else if (i13 == 1) {
            iobyxmoadg(vdvldrhtssVar, ylkuphrtabVar);
        } else if (i13 == 2) {
            wkgbmnqykc(vdvldrhtssVar, ylkuphrtabVar);
        } else {
            if (i13 != 3) {
                throw new IllegalStateException();
            }
            eablkybsjg(vdvldrhtssVar, list);
            ylkuphrtabVar.f109571iobyxmoadg = 0L;
        }
        return 1;
    }
}
