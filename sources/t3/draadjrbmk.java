package t3;

import android.net.Uri;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class draadjrbmk implements yggfygwlhe {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private int f109364btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private int f109365draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f109366dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private int f109367eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private int f109369gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private int f109370lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private int f109371nufgyqmvbu;

    /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
    private int f109373oxmwwwfdhm;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f109374ppxfxbqfkf;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private int f109376vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private com.google.common.collect.zdlpuopuiu f109377wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f109378wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f109379zoijcleaow;

    /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
    private static final int[] f109360kcexrzcfyt = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final iobyxmoadg f109362zdlpuopuiu = new iobyxmoadg(new iobyxmoadg.InterfaceC2686iobyxmoadg() { // from class: t3.btonecajqb
        @Override // t3.draadjrbmk.iobyxmoadg.InterfaceC2686iobyxmoadg
        public final Constructor iobyxmoadg() {
            return draadjrbmk.wflxmlrfwp();
        }
    });

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final iobyxmoadg f109361yggfygwlhe = new iobyxmoadg(new iobyxmoadg.InterfaceC2686iobyxmoadg() { // from class: t3.gtknphoqwx
        @Override // t3.draadjrbmk.iobyxmoadg.InterfaceC2686iobyxmoadg
        public final Constructor iobyxmoadg() {
            return draadjrbmk.agtfadlqog();
        }
    });

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private int f109368gtknphoqwx = 1;

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private int f109363agtfadlqog = 112800;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private q4.oxmwwwfdhm.iobyxmoadg f109375rgvfuqvkyq = new q4.nufgyqmvbu();

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f109372ojitshcjhn = true;

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final InterfaceC2686iobyxmoadg f109380iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Constructor f109381ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final AtomicBoolean f109382zoijcleaow = new AtomicBoolean(false);

        /* JADX INFO: renamed from: t3.draadjrbmk$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public interface InterfaceC2686iobyxmoadg {
            Constructor iobyxmoadg();
        }

        public iobyxmoadg(InterfaceC2686iobyxmoadg interfaceC2686iobyxmoadg) {
            this.f109380iobyxmoadg = interfaceC2686iobyxmoadg;
        }

        private Constructor zoijcleaow() {
            synchronized (this.f109382zoijcleaow) {
                if (this.f109382zoijcleaow.get()) {
                    return this.f109381ppxfxbqfkf;
                }
                try {
                    return this.f109380iobyxmoadg.iobyxmoadg();
                } catch (ClassNotFoundException unused) {
                    this.f109382zoijcleaow.set(true);
                    return this.f109381ppxfxbqfkf;
                } catch (Exception e13) {
                    throw new RuntimeException("Error instantiating extension", e13);
                }
            }
        }

        public rgvfuqvkyq iobyxmoadg(Object... objArr) {
            Constructor constructorZoijcleaow = zoijcleaow();
            if (constructorZoijcleaow == null) {
                return null;
            }
            try {
                return (rgvfuqvkyq) constructorZoijcleaow.newInstance(objArr);
            } catch (Exception e13) {
                throw new IllegalStateException("Unexpected error creating extractor", e13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor agtfadlqog() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(rgvfuqvkyq.class).getConstructor(null);
    }

    private void btonecajqb(int i13, List list) {
        switch (i13) {
            case 0:
                list.add(new a5.zoijcleaow());
                break;
            case 1:
                list.add(new a5.eablkybsjg());
                break;
            case 2:
                list.add(new a5.nufgyqmvbu((this.f109374ppxfxbqfkf ? 2 : 0) | ((this.f109378wkgbmnqykc | (this.f109379zoijcleaow ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new u3.zoijcleaow((this.f109374ppxfxbqfkf ? 2 : 0) | this.f109367eablkybsjg | (this.f109379zoijcleaow ? 1 : 0)));
                break;
            case 4:
                rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg = f109362zdlpuopuiu.iobyxmoadg(Integer.valueOf(this.f109369gxszxtbevo));
                if (rgvfuqvkyqVarIobyxmoadg == null) {
                    list.add(new y3.wkgbmnqykc(this.f109369gxszxtbevo));
                } else {
                    list.add(rgvfuqvkyqVarIobyxmoadg);
                }
                break;
            case 5:
                list.add(new androidx.media3.extractor.flv.zoijcleaow());
                break;
            case 6:
                list.add(new l4.eablkybsjg(this.f109375rgvfuqvkyq, (this.f109372ojitshcjhn ? 0 : 2) | this.f109370lqeggnwhkg));
                break;
            case 7:
                list.add(new m4.gxszxtbevo((this.f109374ppxfxbqfkf ? 2 : 0) | this.f109364btonecajqb | (this.f109379zoijcleaow ? 1 : 0)));
                break;
            case 8:
                list.add(new n4.nufgyqmvbu(this.f109375rgvfuqvkyq, this.f109366dxjokdxxww | n4.nufgyqmvbu.btonecajqb(this.f109376vdvldrhtss) | (this.f109372ojitshcjhn ? 0 : 32)));
                list.add(new n4.agtfadlqog(this.f109375rgvfuqvkyq, (this.f109372ojitshcjhn ? 0 : 16) | this.f109371nufgyqmvbu | n4.agtfadlqog.oxmwwwfdhm(this.f109376vdvldrhtss)));
                break;
            case 9:
                list.add(new o4.wkgbmnqykc());
                break;
            case 10:
                list.add(new a5.istkbnxepw());
                break;
            case 11:
                if (this.f109377wflxmlrfwp == null) {
                    this.f109377wflxmlrfwp = com.google.common.collect.zdlpuopuiu.zynmafqrjb();
                }
                list.add(new a5.hcddaimhww(this.f109368gtknphoqwx, !this.f109372ojitshcjhn ? 1 : 0, this.f109375rgvfuqvkyq, new y2.hcddaimhww(0L), new a5.btonecajqb(this.f109365draadjrbmk, this.f109377wflxmlrfwp), this.f109363agtfadlqog));
                break;
            case 12:
                list.add(new b5.zoijcleaow());
                break;
            case 14:
                list.add(new b4.iobyxmoadg(this.f109373oxmwwwfdhm));
                break;
            case 15:
                rgvfuqvkyq rgvfuqvkyqVarIobyxmoadg2 = f109361yggfygwlhe.iobyxmoadg(new Object[0]);
                if (rgvfuqvkyqVarIobyxmoadg2 != null) {
                    list.add(rgvfuqvkyqVarIobyxmoadg2);
                }
                break;
            case 16:
                list.add(new v3.zoijcleaow(!this.f109372ojitshcjhn ? 1 : 0, this.f109375rgvfuqvkyq));
                break;
            case 17:
                list.add(new p4.iobyxmoadg());
                break;
            case 18:
                list.add(new c5.iobyxmoadg());
                break;
            case 19:
                list.add(new x3.iobyxmoadg());
                break;
            case 20:
                int i14 = this.f109371nufgyqmvbu;
                if ((i14 & 2) == 0 && (i14 & 4) == 0) {
                    list.add(new a4.iobyxmoadg());
                    break;
                }
                break;
            case 21:
                list.add(new w3.iobyxmoadg());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor wflxmlrfwp() {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(rgvfuqvkyq.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    @Override // t3.yggfygwlhe
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public synchronized draadjrbmk wkgbmnqykc(boolean z13) {
        this.f109372ojitshcjhn = z13;
        return this;
    }

    @Override // t3.yggfygwlhe
    public synchronized rgvfuqvkyq[] eablkybsjg(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f109360kcexrzcfyt;
            arrayList = new ArrayList(iArr.length);
            int iZoijcleaow = v2.ojitshcjhn.zoijcleaow(map);
            if (iZoijcleaow != -1) {
                btonecajqb(iZoijcleaow, arrayList);
            }
            int iPpxfxbqfkf = v2.ojitshcjhn.ppxfxbqfkf(uri);
            if (iPpxfxbqfkf != -1 && iPpxfxbqfkf != iZoijcleaow) {
                btonecajqb(iPpxfxbqfkf, arrayList);
            }
            for (int i13 : iArr) {
                if (i13 != iZoijcleaow && i13 != iPpxfxbqfkf) {
                    btonecajqb(i13, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (rgvfuqvkyq[]) arrayList.toArray(new rgvfuqvkyq[arrayList.size()]);
    }

    @Override // t3.yggfygwlhe
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public synchronized draadjrbmk ppxfxbqfkf(int i13) {
        this.f109376vdvldrhtss = i13;
        return this;
    }

    @Override // t3.yggfygwlhe
    public synchronized rgvfuqvkyq[] lqeggnwhkg() {
        return eablkybsjg(Uri.EMPTY, new HashMap());
    }

    public synchronized draadjrbmk ojitshcjhn(int i13) {
        this.f109373oxmwwwfdhm = i13;
        return this;
    }

    @Override // t3.yggfygwlhe
    /* JADX INFO: renamed from: rgvfuqvkyq, reason: merged with bridge method [inline-methods] */
    public synchronized draadjrbmk iobyxmoadg(q4.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar) {
        this.f109375rgvfuqvkyq = iobyxmoadgVar;
        return this;
    }
}
