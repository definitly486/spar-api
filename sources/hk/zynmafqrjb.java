package hk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class zynmafqrjb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final hk.iobyxmoadg f40566iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f40567ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f40568wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f40569zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.vdvldrhtss {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f40571jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f40572yggfygwlhe;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(3, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f40572yggfygwlhe;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                gg.ppxfxbqfkf ppxfxbqfkfVar = (gg.ppxfxbqfkf) this.f40571jyumaefscl;
                byte bIozdgvuglv = zynmafqrjb.this.f40566iobyxmoadg.iozdgvuglv();
                if (bIozdgvuglv == 1) {
                    return zynmafqrjb.this.btonecajqb(true);
                }
                if (bIozdgvuglv == 0) {
                    return zynmafqrjb.this.btonecajqb(false);
                }
                if (bIozdgvuglv != 6) {
                    if (bIozdgvuglv == 8) {
                        return zynmafqrjb.this.gxszxtbevo();
                    }
                    hk.iobyxmoadg.cqumvgiudr(zynmafqrjb.this.f40566iobyxmoadg, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                zynmafqrjb zynmafqrjbVar = zynmafqrjb.this;
                this.f40572yggfygwlhe = 1;
                obj = zynmafqrjbVar.dxjokdxxww(ppxfxbqfkfVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return (gk.btonecajqb) obj;
        }

        @Override // tg.vdvldrhtss
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(gg.ppxfxbqfkf ppxfxbqfkfVar, gg.wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = zynmafqrjb.this.new iobyxmoadg(gxszxtbevoVar);
            iobyxmoadgVar.f40571jyumaefscl = ppxfxbqfkfVar;
            return iobyxmoadgVar.invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        /* synthetic */ Object f40573cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f40575iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f40576jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f40577lereixgezr;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f40578yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f40579zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f40573cqumvgiudr = obj;
            this.f40577lereixgezr |= Integer.MIN_VALUE;
            return zynmafqrjb.this.dxjokdxxww(null, this);
        }
    }

    public zynmafqrjb(gk.lqeggnwhkg configuration, hk.iobyxmoadg lexer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configuration, "configuration");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lexer, "lexer");
        this.f40566iobyxmoadg = lexer;
        this.f40569zoijcleaow = configuration.vdvldrhtss();
        this.f40567ppxfxbqfkf = configuration.wkgbmnqykc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gk.iozdgvuglv btonecajqb(boolean z13) {
        String strVdvldrhtss = (this.f40569zoijcleaow || !z13) ? this.f40566iobyxmoadg.vdvldrhtss() : this.f40566iobyxmoadg.ojitshcjhn();
        return (z13 || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(strVdvldrhtss, "null")) ? new gk.iwizpuwonk(strVdvldrhtss, z13, null, 4, null) : gk.pmvmpeiblj.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0096 -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object dxjokdxxww(gg.ppxfxbqfkf r21, lg.gxszxtbevo r22) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hk.zynmafqrjb.dxjokdxxww(gg.ppxfxbqfkf, lg.gxszxtbevo):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gk.btonecajqb gxszxtbevo() {
        byte bBtonecajqb = this.f40566iobyxmoadg.btonecajqb();
        if (this.f40566iobyxmoadg.iozdgvuglv() == 4) {
            hk.iobyxmoadg.cqumvgiudr(this.f40566iobyxmoadg, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f40566iobyxmoadg.eablkybsjg()) {
            arrayList.add(eablkybsjg());
            bBtonecajqb = this.f40566iobyxmoadg.btonecajqb();
            if (bBtonecajqb != 4) {
                hk.iobyxmoadg iobyxmoadgVar = this.f40566iobyxmoadg;
                boolean z13 = bBtonecajqb == 9;
                int i13 = iobyxmoadgVar.f40509iobyxmoadg;
                if (!z13) {
                    hk.iobyxmoadg.cqumvgiudr(iobyxmoadgVar, "Expected end of the array or comma", i13, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bBtonecajqb == 8) {
            this.f40566iobyxmoadg.gtknphoqwx((byte) 9);
        } else if (bBtonecajqb == 4) {
            if (!this.f40567ppxfxbqfkf) {
                oxmwwwfdhm.lqeggnwhkg(this.f40566iobyxmoadg, "array");
                throw new KotlinNothingValueException();
            }
            this.f40566iobyxmoadg.gtknphoqwx((byte) 9);
        }
        return new gk.ppxfxbqfkf(arrayList);
    }

    private final gk.btonecajqb lqeggnwhkg() {
        return (gk.btonecajqb) gg.zoijcleaow.zoijcleaow(new gg.iobyxmoadg(new iobyxmoadg(null)), gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    private final gk.btonecajqb nufgyqmvbu() {
        byte bGtknphoqwx = this.f40566iobyxmoadg.gtknphoqwx((byte) 6);
        if (this.f40566iobyxmoadg.iozdgvuglv() == 4) {
            hk.iobyxmoadg.cqumvgiudr(this.f40566iobyxmoadg, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (this.f40566iobyxmoadg.eablkybsjg()) {
            String strVdvldrhtss = this.f40569zoijcleaow ? this.f40566iobyxmoadg.vdvldrhtss() : this.f40566iobyxmoadg.ojitshcjhn();
            this.f40566iobyxmoadg.gtknphoqwx((byte) 5);
            linkedHashMap.put(strVdvldrhtss, eablkybsjg());
            bGtknphoqwx = this.f40566iobyxmoadg.btonecajqb();
            if (bGtknphoqwx != 4) {
                if (bGtknphoqwx == 7) {
                    break;
                }
                hk.iobyxmoadg.cqumvgiudr(this.f40566iobyxmoadg, "Expected end of the object or comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        if (bGtknphoqwx == 6) {
            this.f40566iobyxmoadg.gtknphoqwx((byte) 7);
        } else if (bGtknphoqwx == 4) {
            if (!this.f40567ppxfxbqfkf) {
                oxmwwwfdhm.nufgyqmvbu(this.f40566iobyxmoadg, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f40566iobyxmoadg.gtknphoqwx((byte) 7);
        }
        return new gk.cdpycssgdh(linkedHashMap);
    }

    public final gk.btonecajqb eablkybsjg() {
        byte bIozdgvuglv = this.f40566iobyxmoadg.iozdgvuglv();
        if (bIozdgvuglv == 1) {
            return btonecajqb(true);
        }
        if (bIozdgvuglv == 0) {
            return btonecajqb(false);
        }
        if (bIozdgvuglv == 6) {
            int i13 = this.f40568wkgbmnqykc + 1;
            this.f40568wkgbmnqykc = i13;
            gk.btonecajqb btonecajqbVarLqeggnwhkg = i13 == 200 ? lqeggnwhkg() : nufgyqmvbu();
            this.f40568wkgbmnqykc--;
            return btonecajqbVarLqeggnwhkg;
        }
        if (bIozdgvuglv == 8) {
            return gxszxtbevo();
        }
        hk.iobyxmoadg.cqumvgiudr(this.f40566iobyxmoadg, "Cannot read Json element because of unexpected " + hk.zoijcleaow.ppxfxbqfkf(bIozdgvuglv), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }
}
