package androidx.media3.exoplayer.source;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import t3.dsvhmnatus;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class dxjokdxxww implements zdlpuopuiu {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private long f11121btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private float f11122draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private long f11123dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private q4.oxmwwwfdhm.iobyxmoadg f11124eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private float f11125gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private oxmwwwfdhm.iobyxmoadg f11126gxszxtbevo;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.zoijcleaow f11127lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f11128nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iobyxmoadg f11129ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f11130wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg f11131wkgbmnqykc;

    /* JADX INFO: Access modifiers changed from: private */
    static final class iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.zoijcleaow f11132dxjokdxxww;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private q4.oxmwwwfdhm.iobyxmoadg f11134gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final t3.yggfygwlhe f11135iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f11136lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private i3.gtknphoqwx f11137nufgyqmvbu;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg f11139wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Map f11140zoijcleaow = new HashMap();

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final Map f11138ppxfxbqfkf = new HashMap();

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f11133eablkybsjg = true;

        public iobyxmoadg(t3.yggfygwlhe yggfygwlheVar, q4.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar) {
            this.f11135iobyxmoadg = yggfygwlheVar;
            this.f11134gxszxtbevo = iobyxmoadgVar;
        }

        private xa.vdvldrhtss draadjrbmk(int i13) {
            xa.vdvldrhtss vdvldrhtssVar;
            xa.vdvldrhtss vdvldrhtssVar2;
            xa.vdvldrhtss vdvldrhtssVar3 = (xa.vdvldrhtss) this.f11140zoijcleaow.get(Integer.valueOf(i13));
            if (vdvldrhtssVar3 != null) {
                return vdvldrhtssVar3;
            }
            final androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg = (androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11139wkgbmnqykc);
            if (i13 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(oxmwwwfdhm.iobyxmoadg.class);
                vdvldrhtssVar = new xa.vdvldrhtss() { // from class: androidx.media3.exoplayer.source.wkgbmnqykc
                    @Override // xa.vdvldrhtss
                    public final Object get() {
                        return dxjokdxxww.dxjokdxxww(clsAsSubclass, interfaceC0162iobyxmoadg);
                    }
                };
            } else {
                if (i13 != 1) {
                    if (i13 == 2) {
                        final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(oxmwwwfdhm.iobyxmoadg.class);
                        vdvldrhtssVar = new xa.vdvldrhtss() { // from class: androidx.media3.exoplayer.source.gxszxtbevo
                            @Override // xa.vdvldrhtss
                            public final Object get() {
                                return dxjokdxxww.rgvfuqvkyq(clsAsSubclass2, interfaceC0162iobyxmoadg);
                            }
                        };
                    } else if (i13 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(oxmwwwfdhm.iobyxmoadg.class);
                        vdvldrhtssVar2 = new xa.vdvldrhtss() { // from class: androidx.media3.exoplayer.source.lqeggnwhkg
                            @Override // xa.vdvldrhtss
                            public final Object get() {
                                return dxjokdxxww.ojitshcjhn(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i13 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i13);
                        }
                        vdvldrhtssVar2 = new xa.vdvldrhtss() { // from class: androidx.media3.exoplayer.source.nufgyqmvbu
                            @Override // xa.vdvldrhtss
                            public final Object get() {
                                return this.f11250zdlpuopuiu.gtknphoqwx(interfaceC0162iobyxmoadg);
                            }
                        };
                    }
                    this.f11140zoijcleaow.put(Integer.valueOf(i13), vdvldrhtssVar2);
                    return vdvldrhtssVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(oxmwwwfdhm.iobyxmoadg.class);
                vdvldrhtssVar = new xa.vdvldrhtss() { // from class: androidx.media3.exoplayer.source.eablkybsjg
                    @Override // xa.vdvldrhtss
                    public final Object get() {
                        return dxjokdxxww.dxjokdxxww(clsAsSubclass4, interfaceC0162iobyxmoadg);
                    }
                };
            }
            vdvldrhtssVar2 = vdvldrhtssVar;
            this.f11140zoijcleaow.put(Integer.valueOf(i13), vdvldrhtssVar2);
            return vdvldrhtssVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ oxmwwwfdhm.iobyxmoadg gtknphoqwx(androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg) {
            return new istkbnxepw.zoijcleaow(interfaceC0162iobyxmoadg, this.f11135iobyxmoadg);
        }

        public void agtfadlqog(androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg) {
            if (interfaceC0162iobyxmoadg != this.f11139wkgbmnqykc) {
                this.f11139wkgbmnqykc = interfaceC0162iobyxmoadg;
                this.f11140zoijcleaow.clear();
                this.f11138ppxfxbqfkf.clear();
            }
        }

        public oxmwwwfdhm.iobyxmoadg gxszxtbevo(int i13) {
            oxmwwwfdhm.iobyxmoadg iobyxmoadgVar = (oxmwwwfdhm.iobyxmoadg) this.f11138ppxfxbqfkf.get(Integer.valueOf(i13));
            if (iobyxmoadgVar != null) {
                return iobyxmoadgVar;
            }
            oxmwwwfdhm.iobyxmoadg iobyxmoadgVar2 = (oxmwwwfdhm.iobyxmoadg) draadjrbmk(i13).get();
            i3.gtknphoqwx gtknphoqwxVar = this.f11137nufgyqmvbu;
            if (gtknphoqwxVar != null) {
                iobyxmoadgVar2.eablkybsjg(gtknphoqwxVar);
            }
            androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar = this.f11132dxjokdxxww;
            if (zoijcleaowVar != null) {
                iobyxmoadgVar2.gxszxtbevo(zoijcleaowVar);
            }
            iobyxmoadgVar2.iobyxmoadg(this.f11134gxszxtbevo);
            iobyxmoadgVar2.lqeggnwhkg(this.f11133eablkybsjg);
            iobyxmoadgVar2.ppxfxbqfkf(this.f11136lqeggnwhkg);
            this.f11138ppxfxbqfkf.put(Integer.valueOf(i13), iobyxmoadgVar2);
            return iobyxmoadgVar2;
        }

        public void kcexrzcfyt(q4.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar) {
            this.f11134gxszxtbevo = iobyxmoadgVar;
            this.f11135iobyxmoadg.iobyxmoadg(iobyxmoadgVar);
            Iterator it = this.f11138ppxfxbqfkf.values().iterator();
            while (it.hasNext()) {
                ((oxmwwwfdhm.iobyxmoadg) it.next()).iobyxmoadg(iobyxmoadgVar);
            }
        }

        public void ojitshcjhn(i3.gtknphoqwx gtknphoqwxVar) {
            this.f11137nufgyqmvbu = gtknphoqwxVar;
            Iterator it = this.f11138ppxfxbqfkf.values().iterator();
            while (it.hasNext()) {
                ((oxmwwwfdhm.iobyxmoadg) it.next()).eablkybsjg(gtknphoqwxVar);
            }
        }

        public void oxmwwwfdhm(boolean z13) {
            this.f11133eablkybsjg = z13;
            this.f11135iobyxmoadg.wkgbmnqykc(z13);
            Iterator it = this.f11138ppxfxbqfkf.values().iterator();
            while (it.hasNext()) {
                ((oxmwwwfdhm.iobyxmoadg) it.next()).lqeggnwhkg(z13);
            }
        }

        public void rgvfuqvkyq(int i13) {
            t3.yggfygwlhe yggfygwlheVar = this.f11135iobyxmoadg;
            if (yggfygwlheVar instanceof t3.draadjrbmk) {
                ((t3.draadjrbmk) yggfygwlheVar).ojitshcjhn(i13);
            }
        }

        public void vdvldrhtss(androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar) {
            this.f11132dxjokdxxww = zoijcleaowVar;
            Iterator it = this.f11138ppxfxbqfkf.values().iterator();
            while (it.hasNext()) {
                ((oxmwwwfdhm.iobyxmoadg) it.next()).gxszxtbevo(zoijcleaowVar);
            }
        }

        public void wflxmlrfwp(int i13) {
            this.f11136lqeggnwhkg = i13;
            this.f11135iobyxmoadg.ppxfxbqfkf(i13);
        }
    }

    private static final class zoijcleaow implements t3.rgvfuqvkyq {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final androidx.media3.common.iobyxmoadg f11141iobyxmoadg;

        public zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            this.f11141iobyxmoadg = iobyxmoadgVar;
        }

        @Override // t3.rgvfuqvkyq
        public boolean draadjrbmk(t3.vdvldrhtss vdvldrhtssVar) {
            return true;
        }

        @Override // t3.rgvfuqvkyq
        public void iobyxmoadg(long j13, long j14) {
        }

        @Override // t3.rgvfuqvkyq
        public void ppxfxbqfkf(t3.oxmwwwfdhm oxmwwwfdhmVar) {
            dsvhmnatus dsvhmnatusVarKcexrzcfyt = oxmwwwfdhmVar.kcexrzcfyt(0, 3);
            oxmwwwfdhmVar.gxszxtbevo(new t3.pkzmftpjix.zoijcleaow(-9223372036854775807L));
            oxmwwwfdhmVar.agtfadlqog();
            dsvhmnatusVarKcexrzcfyt.iobyxmoadg(this.f11141iobyxmoadg.zoijcleaow().zeieaojujs("text/x-unknown").tzroggbefp(this.f11141iobyxmoadg.f9769ojitshcjhn).cllcsxoeiz());
        }

        @Override // t3.rgvfuqvkyq
        public void release() {
        }

        @Override // t3.rgvfuqvkyq
        public int zoijcleaow(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) {
            return vdvldrhtssVar.btonecajqb(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }
    }

    public dxjokdxxww(Context context, t3.yggfygwlhe yggfygwlheVar) {
        this(new androidx.media3.datasource.zoijcleaow.iobyxmoadg(context), yggfygwlheVar);
    }

    private oxmwwwfdhm agtfadlqog(v2.kcexrzcfyt kcexrzcfytVar, oxmwwwfdhm oxmwwwfdhmVar) {
        y2.iobyxmoadg.eablkybsjg(kcexrzcfytVar.f115398zoijcleaow);
        kcexrzcfytVar.f115398zoijcleaow.getClass();
        return oxmwwwfdhmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ t3.rgvfuqvkyq[] draadjrbmk(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        return new t3.rgvfuqvkyq[]{this.f11124eablkybsjg.iobyxmoadg(iobyxmoadgVar) ? new q4.agtfadlqog(this.f11124eablkybsjg.ppxfxbqfkf(iobyxmoadgVar), null) : new zoijcleaow(iobyxmoadgVar)};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ oxmwwwfdhm.iobyxmoadg dxjokdxxww(Class cls, androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg) {
        return rgvfuqvkyq(cls, interfaceC0162iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static oxmwwwfdhm.iobyxmoadg ojitshcjhn(Class cls) {
        try {
            return (oxmwwwfdhm.iobyxmoadg) cls.getConstructor(null).newInstance(null);
        } catch (Exception e13) {
            throw new IllegalStateException(e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static oxmwwwfdhm.iobyxmoadg rgvfuqvkyq(Class cls, androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg) {
        try {
            return (oxmwwwfdhm.iobyxmoadg) cls.getConstructor(androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg.class).newInstance(interfaceC0162iobyxmoadg);
        } catch (Exception e13) {
            throw new IllegalStateException(e13);
        }
    }

    private static oxmwwwfdhm wflxmlrfwp(v2.kcexrzcfyt kcexrzcfytVar, oxmwwwfdhm oxmwwwfdhmVar) {
        v2.kcexrzcfyt.wkgbmnqykc wkgbmnqykcVar = kcexrzcfytVar.f115392gxszxtbevo;
        return (wkgbmnqykcVar.f115518zoijcleaow == 0 && wkgbmnqykcVar.f115517wkgbmnqykc == Long.MIN_VALUE && !wkgbmnqykcVar.f115513gxszxtbevo) ? oxmwwwfdhmVar : new ClippingMediaSource.zoijcleaow(oxmwwwfdhmVar).wflxmlrfwp(kcexrzcfytVar.f115392gxszxtbevo.f115518zoijcleaow).gtknphoqwx(kcexrzcfytVar.f115392gxszxtbevo.f115517wkgbmnqykc).btonecajqb(!kcexrzcfytVar.f115392gxszxtbevo.f115515lqeggnwhkg).dxjokdxxww(kcexrzcfytVar.f115392gxszxtbevo.f115512eablkybsjg).draadjrbmk(kcexrzcfytVar.f115392gxszxtbevo.f115513gxszxtbevo).nufgyqmvbu();
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
    /* JADX INFO: renamed from: btonecajqb, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww lqeggnwhkg(boolean z13) {
        this.f11130wflxmlrfwp = z13;
        this.f11129ppxfxbqfkf.oxmwwwfdhm(z13);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
    /* JADX INFO: renamed from: gtknphoqwx, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww ppxfxbqfkf(int i13) {
        this.f11129ppxfxbqfkf.wflxmlrfwp(i13);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
    /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww iobyxmoadg(q4.oxmwwwfdhm.iobyxmoadg iobyxmoadgVar) {
        this.f11124eablkybsjg = (q4.oxmwwwfdhm.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar);
        this.f11129ppxfxbqfkf.kcexrzcfyt(iobyxmoadgVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
    /* JADX INFO: renamed from: oxmwwwfdhm, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww gxszxtbevo(androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar) {
        this.f11127lqeggnwhkg = (androidx.media3.exoplayer.upstream.zoijcleaow) y2.iobyxmoadg.gxszxtbevo(zoijcleaowVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f11129ppxfxbqfkf.vdvldrhtss(zoijcleaowVar);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
    /* JADX INFO: renamed from: vdvldrhtss, reason: merged with bridge method [inline-methods] */
    public dxjokdxxww eablkybsjg(i3.gtknphoqwx gtknphoqwxVar) {
        this.f11129ppxfxbqfkf.ojitshcjhn((i3.gtknphoqwx) y2.iobyxmoadg.gxszxtbevo(gtknphoqwxVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.oxmwwwfdhm.iobyxmoadg
    public oxmwwwfdhm wkgbmnqykc(v2.kcexrzcfyt kcexrzcfytVar) {
        y2.iobyxmoadg.eablkybsjg(kcexrzcfytVar.f115398zoijcleaow);
        String scheme = kcexrzcfytVar.f115398zoijcleaow.f115485iobyxmoadg.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((oxmwwwfdhm.iobyxmoadg) y2.iobyxmoadg.eablkybsjg(this.f11126gxszxtbevo)).wkgbmnqykc(kcexrzcfytVar);
        }
        if (Objects.equals(kcexrzcfytVar.f115398zoijcleaow.f115490zoijcleaow, "application/x-image-uri")) {
            long jIxidwrxhsl = stevsuqkhv.ixidwrxhsl(kcexrzcfytVar.f115398zoijcleaow.f115482dxjokdxxww);
            androidx.appcompat.app.yggfygwlhe.iobyxmoadg(y2.iobyxmoadg.eablkybsjg(null));
            return new draadjrbmk.zoijcleaow(jIxidwrxhsl, null).wkgbmnqykc(kcexrzcfytVar);
        }
        v2.kcexrzcfyt.nufgyqmvbu nufgyqmvbuVar = kcexrzcfytVar.f115398zoijcleaow;
        int iTbqsvytpvh = stevsuqkhv.tbqsvytpvh(nufgyqmvbuVar.f115485iobyxmoadg, nufgyqmvbuVar.f115490zoijcleaow);
        if (kcexrzcfytVar.f115398zoijcleaow.f115482dxjokdxxww != -9223372036854775807L) {
            this.f11129ppxfxbqfkf.rgvfuqvkyq(1);
        }
        try {
            oxmwwwfdhm.iobyxmoadg iobyxmoadgVarGxszxtbevo = this.f11129ppxfxbqfkf.gxszxtbevo(iTbqsvytpvh);
            v2.kcexrzcfyt.lqeggnwhkg.iobyxmoadg iobyxmoadgVarIobyxmoadg = kcexrzcfytVar.f115397wkgbmnqykc.iobyxmoadg();
            if (kcexrzcfytVar.f115397wkgbmnqykc.f115465iobyxmoadg == -9223372036854775807L) {
                iobyxmoadgVarIobyxmoadg.gtknphoqwx(this.f11128nufgyqmvbu);
            }
            if (kcexrzcfytVar.f115397wkgbmnqykc.f115467wkgbmnqykc == -3.4028235E38f) {
                iobyxmoadgVarIobyxmoadg.btonecajqb(this.f11125gtknphoqwx);
            }
            if (kcexrzcfytVar.f115397wkgbmnqykc.f115464eablkybsjg == -3.4028235E38f) {
                iobyxmoadgVarIobyxmoadg.nufgyqmvbu(this.f11122draadjrbmk);
            }
            if (kcexrzcfytVar.f115397wkgbmnqykc.f115468zoijcleaow == -9223372036854775807L) {
                iobyxmoadgVarIobyxmoadg.dxjokdxxww(this.f11123dxjokdxxww);
            }
            if (kcexrzcfytVar.f115397wkgbmnqykc.f115466ppxfxbqfkf == -9223372036854775807L) {
                iobyxmoadgVarIobyxmoadg.lqeggnwhkg(this.f11121btonecajqb);
            }
            v2.kcexrzcfyt.lqeggnwhkg lqeggnwhkgVarGxszxtbevo = iobyxmoadgVarIobyxmoadg.gxszxtbevo();
            if (!lqeggnwhkgVarGxszxtbevo.equals(kcexrzcfytVar.f115397wkgbmnqykc)) {
                kcexrzcfytVar = kcexrzcfytVar.iobyxmoadg().ppxfxbqfkf(lqeggnwhkgVarGxszxtbevo).iobyxmoadg();
            }
            oxmwwwfdhm oxmwwwfdhmVarWkgbmnqykc = iobyxmoadgVarGxszxtbevo.wkgbmnqykc(kcexrzcfytVar);
            com.google.common.collect.zdlpuopuiu zdlpuopuiuVar = ((v2.kcexrzcfyt.nufgyqmvbu) stevsuqkhv.nufgyqmvbu(kcexrzcfytVar.f115398zoijcleaow)).f115484gxszxtbevo;
            if (!zdlpuopuiuVar.isEmpty()) {
                oxmwwwfdhm[] oxmwwwfdhmVarArr = new oxmwwwfdhm[zdlpuopuiuVar.size() + 1];
                oxmwwwfdhmVarArr[0] = oxmwwwfdhmVarWkgbmnqykc;
                for (int i13 = 0; i13 < zdlpuopuiuVar.size(); i13++) {
                    if (this.f11130wflxmlrfwp) {
                        final androidx.media3.common.iobyxmoadg iobyxmoadgVarCllcsxoeiz = new androidx.media3.common.iobyxmoadg.zoijcleaow().zeieaojujs(((v2.kcexrzcfyt.gtknphoqwx) zdlpuopuiuVar.get(i13)).f115423zoijcleaow).uwvvkdfqfp(((v2.kcexrzcfyt.gtknphoqwx) zdlpuopuiuVar.get(i13)).f115421ppxfxbqfkf).tbqsvytpvh(((v2.kcexrzcfyt.gtknphoqwx) zdlpuopuiuVar.get(i13)).f115422wkgbmnqykc).weqkydbzbr(((v2.kcexrzcfyt.gtknphoqwx) zdlpuopuiuVar.get(i13)).f115417eablkybsjg).rlfsiqarku(((v2.kcexrzcfyt.gtknphoqwx) zdlpuopuiuVar.get(i13)).f115418gxszxtbevo).xrmfcynszj(((v2.kcexrzcfyt.gtknphoqwx) zdlpuopuiuVar.get(i13)).f115420lqeggnwhkg).cllcsxoeiz();
                        istkbnxepw.zoijcleaow zoijcleaowVar = new istkbnxepw.zoijcleaow(this.f11131wkgbmnqykc, new t3.yggfygwlhe() { // from class: m3.lqeggnwhkg
                            @Override // t3.yggfygwlhe
                            public final t3.rgvfuqvkyq[] lqeggnwhkg() {
                                return this.f65043zoijcleaow.draadjrbmk(iobyxmoadgVarCllcsxoeiz);
                            }
                        });
                        if (this.f11124eablkybsjg.iobyxmoadg(iobyxmoadgVarCllcsxoeiz)) {
                            iobyxmoadgVarCllcsxoeiz = iobyxmoadgVarCllcsxoeiz.zoijcleaow().zeieaojujs("application/x-media3-cues").tzroggbefp(iobyxmoadgVarCllcsxoeiz.f9769ojitshcjhn).sopmlzcsov(this.f11124eablkybsjg.zoijcleaow(iobyxmoadgVarCllcsxoeiz)).cllcsxoeiz();
                        }
                        istkbnxepw.zoijcleaow zoijcleaowVarDxjokdxxww = zoijcleaowVar.dxjokdxxww(0, iobyxmoadgVarCllcsxoeiz);
                        androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar2 = this.f11127lqeggnwhkg;
                        if (zoijcleaowVar2 != null) {
                            zoijcleaowVarDxjokdxxww.gxszxtbevo(zoijcleaowVar2);
                        }
                        oxmwwwfdhmVarArr[i13 + 1] = zoijcleaowVarDxjokdxxww.wkgbmnqykc(v2.kcexrzcfyt.zoijcleaow(((v2.kcexrzcfyt.gtknphoqwx) zdlpuopuiuVar.get(i13)).f115419iobyxmoadg.toString()));
                    } else {
                        ylkuphrtab.zoijcleaow zoijcleaowVar3 = new ylkuphrtab.zoijcleaow(this.f11131wkgbmnqykc);
                        androidx.media3.exoplayer.upstream.zoijcleaow zoijcleaowVar4 = this.f11127lqeggnwhkg;
                        if (zoijcleaowVar4 != null) {
                            zoijcleaowVar3.zoijcleaow(zoijcleaowVar4);
                        }
                        oxmwwwfdhmVarArr[i13 + 1] = zoijcleaowVar3.iobyxmoadg((v2.kcexrzcfyt.gtknphoqwx) zdlpuopuiuVar.get(i13), -9223372036854775807L);
                    }
                }
                oxmwwwfdhmVarWkgbmnqykc = new MergingMediaSource(oxmwwwfdhmVarArr);
            }
            return agtfadlqog(kcexrzcfytVar, wflxmlrfwp(kcexrzcfytVar, oxmwwwfdhmVarWkgbmnqykc));
        } catch (ClassNotFoundException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public dxjokdxxww(androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg) {
        this(interfaceC0162iobyxmoadg, new t3.draadjrbmk());
    }

    public dxjokdxxww(androidx.media3.datasource.iobyxmoadg.InterfaceC0162iobyxmoadg interfaceC0162iobyxmoadg, t3.yggfygwlhe yggfygwlheVar) {
        this.f11131wkgbmnqykc = interfaceC0162iobyxmoadg;
        q4.nufgyqmvbu nufgyqmvbuVar = new q4.nufgyqmvbu();
        this.f11124eablkybsjg = nufgyqmvbuVar;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(yggfygwlheVar, nufgyqmvbuVar);
        this.f11129ppxfxbqfkf = iobyxmoadgVar;
        iobyxmoadgVar.agtfadlqog(interfaceC0162iobyxmoadg);
        this.f11128nufgyqmvbu = -9223372036854775807L;
        this.f11123dxjokdxxww = -9223372036854775807L;
        this.f11121btonecajqb = -9223372036854775807L;
        this.f11125gtknphoqwx = -3.4028235E38f;
        this.f11122draadjrbmk = -3.4028235E38f;
        this.f11130wflxmlrfwp = true;
    }
}
