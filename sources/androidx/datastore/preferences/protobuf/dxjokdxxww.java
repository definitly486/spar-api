package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class dxjokdxxww implements uwvvkdfqfp {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final CodedOutputStream f8634iobyxmoadg;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f8635iobyxmoadg;

        static {
            int[] iArr = new int[czzsidtyhn.zoijcleaow.values().length];
            f8635iobyxmoadg = iArr;
            try {
                iArr[czzsidtyhn.zoijcleaow.f8611istkbnxepw.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8622zynmafqrjb.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8615lereixgezr.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8617pkzmftpjix.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8613jpowsppfya.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8619wwaezpbzkn.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8618pmvmpeiblj.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8606cqumvgiudr.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8608hcddaimhww.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8609hkdspvbjdz.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8607esjtqupxsv.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8635iobyxmoadg[czzsidtyhn.zoijcleaow.f8604cdpycssgdh.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private dxjokdxxww(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) zdlpuopuiu.zoijcleaow(codedOutputStream, "output");
        this.f8634iobyxmoadg = codedOutputStream2;
        codedOutputStream2.f8580iobyxmoadg = this;
    }

    private void btonecajqb(int i13, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i14 = 0;
        while (it.hasNext()) {
            jArr[i14] = ((Long) it.next()).longValue();
            i14++;
        }
        Arrays.sort(jArr);
        for (int i15 = 0; i15 < size; i15++) {
            long j13 = jArr[i15];
            Object obj = map.get(Long.valueOf(j13));
            this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
            this.f8634iobyxmoadg.fmlbqenlif(pmvmpeiblj.zoijcleaow(iobyxmoadgVar, Long.valueOf(j13), obj));
            pmvmpeiblj.eablkybsjg(this.f8634iobyxmoadg, iobyxmoadgVar, Long.valueOf(j13), obj);
        }
    }

    private void draadjrbmk(int i13, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i14 = 0;
        while (it.hasNext()) {
            strArr[i14] = (String) it.next();
            i14++;
        }
        Arrays.sort(strArr);
        for (int i15 = 0; i15 < size; i15++) {
            String str = strArr[i15];
            Object obj = map.get(str);
            this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
            this.f8634iobyxmoadg.fmlbqenlif(pmvmpeiblj.zoijcleaow(iobyxmoadgVar, str, obj));
            pmvmpeiblj.eablkybsjg(this.f8634iobyxmoadg, iobyxmoadgVar, str, obj);
        }
    }

    private void dxjokdxxww(int i13, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i14 = 0;
        while (it.hasNext()) {
            iArr[i14] = ((Integer) it.next()).intValue();
            i14++;
        }
        Arrays.sort(iArr);
        for (int i15 = 0; i15 < size; i15++) {
            int i16 = iArr[i15];
            Object obj = map.get(Integer.valueOf(i16));
            this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
            this.f8634iobyxmoadg.fmlbqenlif(pmvmpeiblj.zoijcleaow(iobyxmoadgVar, Integer.valueOf(i16), obj));
            pmvmpeiblj.eablkybsjg(this.f8634iobyxmoadg, iobyxmoadgVar, Integer.valueOf(i16), obj);
        }
    }

    private void gtknphoqwx(int i13, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, Map map) {
        switch (iobyxmoadg.f8635iobyxmoadg[iobyxmoadgVar.f8771iobyxmoadg.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    nufgyqmvbu(i13, false, obj, iobyxmoadgVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    nufgyqmvbu(i13, true, obj2, iobyxmoadgVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dxjokdxxww(i13, iobyxmoadgVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                btonecajqb(i13, iobyxmoadgVar, map);
                return;
            case 12:
                draadjrbmk(i13, iobyxmoadgVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + iobyxmoadgVar.f8771iobyxmoadg);
        }
    }

    public static dxjokdxxww lqeggnwhkg(CodedOutputStream codedOutputStream) {
        dxjokdxxww dxjokdxxwwVar = codedOutputStream.f8580iobyxmoadg;
        return dxjokdxxwwVar != null ? dxjokdxxwwVar : new dxjokdxxww(codedOutputStream);
    }

    private void nufgyqmvbu(int i13, boolean z13, Object obj, pmvmpeiblj.iobyxmoadg iobyxmoadgVar) {
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        this.f8634iobyxmoadg.fmlbqenlif(pmvmpeiblj.zoijcleaow(iobyxmoadgVar, Boolean.valueOf(z13), obj));
        pmvmpeiblj.eablkybsjg(this.f8634iobyxmoadg, iobyxmoadgVar, Boolean.valueOf(z13), obj);
    }

    private void wflxmlrfwp(int i13, Object obj) {
        if (obj instanceof String) {
            this.f8634iobyxmoadg.grlcpdaxtj(i13, (String) obj);
        } else {
            this.f8634iobyxmoadg.xrmfcynszj(i13, (gxszxtbevo) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void eablkybsjg(int i13, Object obj, sopmlzcsov sopmlzcsovVar) {
        this.f8634iobyxmoadg.weqkydbzbr(i13, (wwaezpbzkn) obj, sopmlzcsovVar);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public uwvvkdfqfp.iobyxmoadg fieldOrder() {
        return uwvvkdfqfp.iobyxmoadg.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void gxszxtbevo(int i13, List list, sopmlzcsov sopmlzcsovVar) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            ppxfxbqfkf(i13, list.get(i14), sopmlzcsovVar);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void iobyxmoadg(int i13, List list, sopmlzcsov sopmlzcsovVar) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            eablkybsjg(i13, list.get(i14), sopmlzcsovVar);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void ppxfxbqfkf(int i13, Object obj, sopmlzcsov sopmlzcsovVar) {
        this.f8634iobyxmoadg.auzgnhcxok(i13, (wwaezpbzkn) obj, sopmlzcsovVar);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void wkgbmnqykc(int i13, pmvmpeiblj.iobyxmoadg iobyxmoadgVar, Map map) {
        if (this.f8634iobyxmoadg.jlmebxxoox()) {
            gtknphoqwx(i13, iobyxmoadgVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
            this.f8634iobyxmoadg.fmlbqenlif(pmvmpeiblj.zoijcleaow(iobyxmoadgVar, entry.getKey(), entry.getValue()));
            pmvmpeiblj.eablkybsjg(this.f8634iobyxmoadg, iobyxmoadgVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeBool(int i13, boolean z13) {
        this.f8634iobyxmoadg.jhduphickx(i13, z13);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeBoolList(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.jhduphickx(i13, ((Boolean) list.get(i14)).booleanValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iWkgbmnqykc = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iWkgbmnqykc += CodedOutputStream.wkgbmnqykc(((Boolean) list.get(i15)).booleanValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iWkgbmnqykc);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.ikoacuggdj(((Boolean) list.get(i14)).booleanValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeBytesList(int i13, List list) {
        for (int i14 = 0; i14 < list.size(); i14++) {
            this.f8634iobyxmoadg.xrmfcynszj(i13, (gxszxtbevo) list.get(i14));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeDouble(int i13, double d13) {
        this.f8634iobyxmoadg.rlfsiqarku(i13, d13);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeDoubleList(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.rlfsiqarku(i13, ((Double) list.get(i14)).doubleValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iDxjokdxxww = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iDxjokdxxww += CodedOutputStream.dxjokdxxww(((Double) list.get(i15)).doubleValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iDxjokdxxww);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.czzsidtyhn(((Double) list.get(i14)).doubleValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeEndGroup(int i13) {
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeEnum(int i13, int i14) {
        this.f8634iobyxmoadg.uwvvkdfqfp(i13, i14);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeEnumList(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.uwvvkdfqfp(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iGtknphoqwx = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iGtknphoqwx += CodedOutputStream.gtknphoqwx(((Integer) list.get(i15)).intValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iGtknphoqwx);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.yfnezrywwk(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeFixed32(int i13, int i14) {
        this.f8634iobyxmoadg.ydmasvzmpa(i13, i14);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeFixed32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.ydmasvzmpa(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iWflxmlrfwp = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iWflxmlrfwp += CodedOutputStream.wflxmlrfwp(((Integer) list.get(i15)).intValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iWflxmlrfwp);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.sflfametgt(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeFixed64(int i13, long j13) {
        this.f8634iobyxmoadg.zfvoamnweg(i13, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeFixed64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.zfvoamnweg(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iOjitshcjhn = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iOjitshcjhn += CodedOutputStream.ojitshcjhn(((Long) list.get(i15)).longValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iOjitshcjhn);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.oipsdeybqn(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeFloat(int i13, float f13) {
        this.f8634iobyxmoadg.bfopjjpdmp(i13, f13);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeFloatList(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.bfopjjpdmp(i13, ((Float) list.get(i14)).floatValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iVdvldrhtss = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iVdvldrhtss += CodedOutputStream.vdvldrhtss(((Float) list.get(i15)).floatValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iVdvldrhtss);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.opjhrmiecq(((Float) list.get(i14)).floatValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeInt32(int i13, int i14) {
        this.f8634iobyxmoadg.nuxfzjnpeb(i13, i14);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeInt32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.nuxfzjnpeb(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iJyumaefscl = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iJyumaefscl += CodedOutputStream.jyumaefscl(((Integer) list.get(i15)).intValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iJyumaefscl);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.tbqsvytpvh(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeInt64(int i13, long j13) {
        this.f8634iobyxmoadg.roivzttewh(i13, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeInt64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.roivzttewh(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iCqumvgiudr = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iCqumvgiudr += CodedOutputStream.cqumvgiudr(((Long) list.get(i15)).longValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iCqumvgiudr);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.uawqvzlxes(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public final void writeMessageSetItem(int i13, Object obj) {
        if (obj instanceof gxszxtbevo) {
            this.f8634iobyxmoadg.skhdrjzrfn(i13, (gxszxtbevo) obj);
        } else {
            this.f8634iobyxmoadg.dvvnrvtcbc(i13, (wwaezpbzkn) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeSFixed32(int i13, int i14) {
        this.f8634iobyxmoadg.igdgnonuha(i13, i14);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeSFixed32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.igdgnonuha(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iLmojexxdyd = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iLmojexxdyd += CodedOutputStream.lmojexxdyd(((Integer) list.get(i15)).intValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iLmojexxdyd);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.lxfrhoxuzk(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeSFixed64(int i13, long j13) {
        this.f8634iobyxmoadg.wizcaqwiak(i13, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeSFixed64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.wizcaqwiak(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iYlkuphrtab = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iYlkuphrtab += CodedOutputStream.ylkuphrtab(((Long) list.get(i15)).longValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iYlkuphrtab);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.hszhottldk(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeSInt32(int i13, int i14) {
        this.f8634iobyxmoadg.fiwbwshyhd(i13, i14);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeSInt32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.fiwbwshyhd(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iHcddaimhww = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iHcddaimhww += CodedOutputStream.hcddaimhww(((Integer) list.get(i15)).intValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iHcddaimhww);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.ageimvtcrz(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeSInt64(int i13, long j13) {
        this.f8634iobyxmoadg.fyldjkxazc(i13, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeSInt64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.fyldjkxazc(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iHkdspvbjdz = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iHkdspvbjdz += CodedOutputStream.hkdspvbjdz(((Long) list.get(i15)).longValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iHkdspvbjdz);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.ipoelvxyzq(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeStartGroup(int i13) {
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeString(int i13, String str) {
        this.f8634iobyxmoadg.grlcpdaxtj(i13, str);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeStringList(int i13, List list) {
        int i14 = 0;
        if (!(list instanceof cqumvgiudr)) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.grlcpdaxtj(i13, (String) list.get(i14));
                i14++;
            }
        } else {
            cqumvgiudr cqumvgiudrVar = (cqumvgiudr) list;
            while (i14 < list.size()) {
                wflxmlrfwp(i13, cqumvgiudrVar.getRaw(i14));
                i14++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeUInt32(int i13, int i14) {
        this.f8634iobyxmoadg.jrbgnlbqoe(i13, i14);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeUInt32List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.jrbgnlbqoe(i13, ((Integer) list.get(i14)).intValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iKegysxyocb = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iKegysxyocb += CodedOutputStream.kegysxyocb(((Integer) list.get(i15)).intValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iKegysxyocb);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.fmlbqenlif(((Integer) list.get(i14)).intValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeUInt64(int i13, long j13) {
        this.f8634iobyxmoadg.ezmngbhpjk(i13, j13);
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void writeUInt64List(int i13, List list, boolean z13) {
        int i14 = 0;
        if (!z13) {
            while (i14 < list.size()) {
                this.f8634iobyxmoadg.ezmngbhpjk(i13, ((Long) list.get(i14)).longValue());
                i14++;
            }
            return;
        }
        this.f8634iobyxmoadg.ixidwrxhsl(i13, 2);
        int iMbcevpiqjq = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            iMbcevpiqjq += CodedOutputStream.mbcevpiqjq(((Long) list.get(i15)).longValue());
        }
        this.f8634iobyxmoadg.fmlbqenlif(iMbcevpiqjq);
        while (i14 < list.size()) {
            this.f8634iobyxmoadg.rhgxfdycjh(((Long) list.get(i14)).longValue());
            i14++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.uwvvkdfqfp
    public void zoijcleaow(int i13, gxszxtbevo gxszxtbevoVar) {
        this.f8634iobyxmoadg.xrmfcynszj(i13, gxszxtbevoVar);
    }
}
