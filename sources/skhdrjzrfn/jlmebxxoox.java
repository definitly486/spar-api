package skhdrjzrfn;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.w;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class jlmebxxoox {

    static final class eablkybsjg implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ tg.draadjrbmk f107446iobyxmoadg;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f107447iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            private /* synthetic */ Object f107448jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f107449yggfygwlhe;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f107447iwizpuwonk = draadjrbmkVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f107447iwizpuwonk, gxszxtbevoVar);
                iobyxmoadgVar.f107448jyumaefscl = obj;
                return iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002f
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                    int r1 = r4.f107449yggfygwlhe
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f107448jyumaefscl
                    t.zoijcleaow r1 = (t.zoijcleaow) r1
                    gg.zdlpuopuiu.zoijcleaow(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    gg.zdlpuopuiu.zoijcleaow(r5)
                    java.lang.Object r5 = r4.f107448jyumaefscl
                    t.zoijcleaow r5 = (t.zoijcleaow) r5
                    r1 = r5
                L23:
                    t.oxmwwwfdhm r5 = t.oxmwwwfdhm.Initial
                    r4.f107448jyumaefscl = r1
                    r4.f107449yggfygwlhe = r2
                    java.lang.Object r5 = r1.yzdjzghtvl(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    t.rgvfuqvkyq r5 = (t.rgvfuqvkyq) r5
                    tg.draadjrbmk r3 = r4.f107447iwizpuwonk
                    boolean r5 = skhdrjzrfn.jlmebxxoox.btonecajqb(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: skhdrjzrfn.jlmebxxoox.eablkybsjg.iobyxmoadg.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(t.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(zoijcleaowVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        eablkybsjg(tg.draadjrbmk draadjrbmkVar) {
            this.f107446iobyxmoadg = draadjrbmkVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(t.ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objX = ylkuphrtabVar.X(new iobyxmoadg(this.f107446iobyxmoadg, null), gxszxtbevoVar);
            return objX == mg.zoijcleaow.gxszxtbevo() ? objX : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f107450jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f107451yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107452zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107451yggfygwlhe = obj;
            this.f107450jyumaefscl |= Integer.MIN_VALUE;
            return jlmebxxoox.nufgyqmvbu(null, this);
        }
    }

    static final class ppxfxbqfkf implements PointerInputEventHandler {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ rgvfuqvkyq f107453iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ opjhrmiecq.c f107454zoijcleaow;

        static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ draadjrbmk f107455cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            final /* synthetic */ opjhrmiecq.c f107456esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ rgvfuqvkyq f107457iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            private /* synthetic */ Object f107458jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            int f107459yggfygwlhe;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            iobyxmoadg(rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, opjhrmiecq.c cVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f107457iwizpuwonk = rgvfuqvkyqVar;
                this.f107455cqumvgiudr = draadjrbmkVar;
                this.f107456esjtqupxsv = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f107457iwizpuwonk, this.f107455cqumvgiudr, this.f107456esjtqupxsv, gxszxtbevoVar);
                iobyxmoadgVar.f107458jyumaefscl = obj;
                return iobyxmoadgVar;
            }

            /* JADX WARN: Code duplicated, block: B:30:0x007c  */
            /* JADX WARN: Code duplicated, block: B:32:0x0088 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                t.zoijcleaow zoijcleaowVar;
                opjhrmiecq.c cVar;
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f107459yggfygwlhe;
                if (i13 != 0) {
                    if (i13 == 1) {
                        zoijcleaowVar = (t.zoijcleaow) this.f107458jyumaefscl;
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    } else {
                        if (i13 != 2 && i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gg.zdlpuopuiu.zoijcleaow(obj);
                    }
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
                zoijcleaowVar = (t.zoijcleaow) this.f107458jyumaefscl;
                this.f107458jyumaefscl = zoijcleaowVar;
                this.f107459yggfygwlhe = 1;
                obj = jlmebxxoox.nufgyqmvbu(zoijcleaowVar, this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                t.rgvfuqvkyq rgvfuqvkyqVar = (t.rgvfuqvkyq) obj;
                if (jlmebxxoox.btonecajqb(rgvfuqvkyqVar) && t.zdlpuopuiu.zoijcleaow(rgvfuqvkyqVar.zoijcleaow())) {
                    List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
                    int size = listPpxfxbqfkf.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            rgvfuqvkyq rgvfuqvkyqVar2 = this.f107457iwizpuwonk;
                            draadjrbmk draadjrbmkVar = this.f107455cqumvgiudr;
                            this.f107458jyumaefscl = null;
                            this.f107459yggfygwlhe = 2;
                            if (jlmebxxoox.gtknphoqwx(zoijcleaowVar, rgvfuqvkyqVar2, draadjrbmkVar, rgvfuqvkyqVar, this) == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else {
                            if (((t.pmvmpeiblj) listPpxfxbqfkf.get(i14)).rgvfuqvkyq()) {
                                break;
                            }
                            i14++;
                        }
                    }
                    if (!jlmebxxoox.btonecajqb(rgvfuqvkyqVar)) {
                        cVar = this.f107456esjtqupxsv;
                        this.f107458jyumaefscl = null;
                        this.f107459yggfygwlhe = 3;
                        if (jlmebxxoox.ojitshcjhn(zoijcleaowVar, cVar, rgvfuqvkyqVar, this) == objGxszxtbevo) {
                            return objGxszxtbevo;
                        }
                    }
                } else if (!jlmebxxoox.btonecajqb(rgvfuqvkyqVar)) {
                    cVar = this.f107456esjtqupxsv;
                    this.f107458jyumaefscl = null;
                    this.f107459yggfygwlhe = 3;
                    if (jlmebxxoox.ojitshcjhn(zoijcleaowVar, cVar, rgvfuqvkyqVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
            public final Object invoke(t.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((iobyxmoadg) create(zoijcleaowVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        ppxfxbqfkf(rgvfuqvkyq rgvfuqvkyqVar, opjhrmiecq.c cVar) {
            this.f107453iobyxmoadg = rgvfuqvkyqVar;
            this.f107454zoijcleaow = cVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(t.ylkuphrtab ylkuphrtabVar, lg.gxszxtbevo gxszxtbevoVar) {
            Object objWkgbmnqykc = jztzpxfvev.cllcsxoeiz.wkgbmnqykc(ylkuphrtabVar, new iobyxmoadg(this.f107453iobyxmoadg, new draadjrbmk(ylkuphrtabVar.getViewConfiguration()), this.f107454zoijcleaow, null), gxszxtbevoVar);
            return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : gg.wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    static final class wkgbmnqykc extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f107460cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f107461iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f107462jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107463yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107464zdlpuopuiu;

        wkgbmnqykc(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107461iwizpuwonk = obj;
            this.f107460cqumvgiudr |= Integer.MIN_VALUE;
            return jlmebxxoox.ojitshcjhn(null, null, null, this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        int f107465cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        /* synthetic */ Object f107466iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f107467jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f107468yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f107469zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f107466iwizpuwonk = obj;
            this.f107465cqumvgiudr |= Integer.MIN_VALUE;
            return jlmebxxoox.gtknphoqwx(null, null, null, null, this);
        }
    }

    public static final androidx.compose.ui.wkgbmnqykc agtfadlqog(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, rgvfuqvkyq rgvfuqvkyqVar, opjhrmiecq.c cVar) {
        return t.tzroggbefp.wkgbmnqykc(wkgbmnqykcVar, rgvfuqvkyqVar, cVar, new ppxfxbqfkf(rgvfuqvkyqVar, cVar));
    }

    public static final boolean btonecajqb(t.rgvfuqvkyq rgvfuqvkyqVar) {
        List listPpxfxbqfkf = rgvfuqvkyqVar.ppxfxbqfkf();
        int size = listPpxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (!t.cllcsxoeiz.lqeggnwhkg(((t.pmvmpeiblj) listPpxfxbqfkf.get(i13)).agtfadlqog(), t.cllcsxoeiz.f109054iobyxmoadg.zoijcleaow())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(rgvfuqvkyq rgvfuqvkyqVar, t.pmvmpeiblj pmvmpeibljVar) {
        if (rgvfuqvkyqVar.ppxfxbqfkf(pmvmpeibljVar.nufgyqmvbu())) {
            pmvmpeibljVar.iobyxmoadg();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean dxjokdxxww(w wVar, t.pmvmpeiblj pmvmpeibljVar, t.pmvmpeiblj pmvmpeibljVar2) {
        return g.eablkybsjg.gtknphoqwx(g.eablkybsjg.rgvfuqvkyq(pmvmpeibljVar.nufgyqmvbu(), pmvmpeibljVar2.nufgyqmvbu())) < jztzpxfvev.jyumaefscl.iwizpuwonk(wVar, pmvmpeibljVar.agtfadlqog());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object gtknphoqwx(t.zoijcleaow zoijcleaowVar, final rgvfuqvkyq rgvfuqvkyqVar, draadjrbmk draadjrbmkVar, t.rgvfuqvkyq rgvfuqvkyqVar2, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar2;
        final kegysxyocb kegysxyocbVarDraadjrbmk;
        t.zoijcleaow zoijcleaowVar3;
        kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar;
        List listPpxfxbqfkf;
        int size;
        t.pmvmpeiblj pmvmpeibljVar;
        List listPpxfxbqfkf2;
        int size2;
        t.pmvmpeiblj pmvmpeibljVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar2 = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar2.f107465cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar2.f107465cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar2 = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar2 = new zoijcleaow(gxszxtbevoVar);
        }
        Object objYggfygwlhe = zoijcleaowVar2.f107466iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar2.f107465cqumvgiudr;
        int i15 = 0;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objYggfygwlhe);
            draadjrbmkVar.wkgbmnqykc(rgvfuqvkyqVar2);
            t.pmvmpeiblj pmvmpeibljVar3 = (t.pmvmpeiblj) rgvfuqvkyqVar2.ppxfxbqfkf().get(0);
            if (!c.lmojexxdyd(rgvfuqvkyqVar2)) {
                int iIobyxmoadg = draadjrbmkVar.iobyxmoadg();
                if (iIobyxmoadg != 1) {
                    kegysxyocbVarDraadjrbmk = iIobyxmoadg != 2 ? kegysxyocb.f107483iobyxmoadg.wflxmlrfwp() : kegysxyocb.f107483iobyxmoadg.agtfadlqog();
                } else {
                    kegysxyocbVarDraadjrbmk = kegysxyocb.f107483iobyxmoadg.draadjrbmk();
                }
                if (rgvfuqvkyqVar.iobyxmoadg(pmvmpeibljVar3.nufgyqmvbu(), kegysxyocbVarDraadjrbmk, draadjrbmkVar.iobyxmoadg())) {
                    final kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar2 = new kotlin.jvm.internal.ylkuphrtab();
                    ylkuphrtabVar2.f60038zdlpuopuiu = !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(kegysxyocbVarDraadjrbmk, kegysxyocb.f107483iobyxmoadg.draadjrbmk());
                    long jGxszxtbevo = pmvmpeibljVar3.gxszxtbevo();
                    tg.draadjrbmk draadjrbmkVar2 = new tg.draadjrbmk() { // from class: skhdrjzrfn.crxdokpmqz
                        @Override // tg.draadjrbmk
                        public final Object invoke(Object obj) {
                            return jlmebxxoox.wflxmlrfwp(rgvfuqvkyqVar, kegysxyocbVarDraadjrbmk, ylkuphrtabVar2, (t.pmvmpeiblj) obj);
                        }
                    };
                    zoijcleaowVar2.f107469zdlpuopuiu = zoijcleaowVar;
                    zoijcleaowVar2.f107468yggfygwlhe = rgvfuqvkyqVar;
                    zoijcleaowVar2.f107467jyumaefscl = ylkuphrtabVar2;
                    zoijcleaowVar2.f107465cqumvgiudr = 2;
                    objYggfygwlhe = jztzpxfvev.jyumaefscl.yggfygwlhe(zoijcleaowVar, jGxszxtbevo, draadjrbmkVar2, zoijcleaowVar2);
                    if (objYggfygwlhe == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                    zoijcleaowVar3 = zoijcleaowVar;
                    ylkuphrtabVar = ylkuphrtabVar2;
                    if (((Boolean) objYggfygwlhe).booleanValue()) {
                        listPpxfxbqfkf2 = zoijcleaowVar3.b().ppxfxbqfkf();
                        size2 = listPpxfxbqfkf2.size();
                        while (i15 < size2) {
                            pmvmpeibljVar2 = (t.pmvmpeiblj) listPpxfxbqfkf2.get(i15);
                            if (t.vdvldrhtss.ppxfxbqfkf(pmvmpeibljVar2)) {
                                pmvmpeibljVar2.iobyxmoadg();
                            }
                            i15++;
                        }
                    }
                    rgvfuqvkyqVar.zoijcleaow();
                }
            } else if (rgvfuqvkyqVar.wkgbmnqykc(pmvmpeibljVar3.nufgyqmvbu())) {
                long jGxszxtbevo2 = pmvmpeibljVar3.gxszxtbevo();
                tg.draadjrbmk draadjrbmkVar3 = new tg.draadjrbmk() { // from class: skhdrjzrfn.sopmlzcsov
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return jlmebxxoox.draadjrbmk(rgvfuqvkyqVar, (t.pmvmpeiblj) obj);
                    }
                };
                zoijcleaowVar2.f107469zdlpuopuiu = zoijcleaowVar;
                zoijcleaowVar2.f107468yggfygwlhe = rgvfuqvkyqVar;
                zoijcleaowVar2.f107465cqumvgiudr = 1;
                objYggfygwlhe = jztzpxfvev.jyumaefscl.yggfygwlhe(zoijcleaowVar, jGxszxtbevo2, draadjrbmkVar3, zoijcleaowVar2);
                if (objYggfygwlhe == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (((Boolean) objYggfygwlhe).booleanValue()) {
                    listPpxfxbqfkf = zoijcleaowVar.b().ppxfxbqfkf();
                    size = listPpxfxbqfkf.size();
                    while (i15 < size) {
                        pmvmpeibljVar = (t.pmvmpeiblj) listPpxfxbqfkf.get(i15);
                        if (t.vdvldrhtss.ppxfxbqfkf(pmvmpeibljVar)) {
                            pmvmpeibljVar.iobyxmoadg();
                        }
                        i15++;
                    }
                }
                rgvfuqvkyqVar.zoijcleaow();
            }
        } else if (i14 == 1) {
            rgvfuqvkyqVar = (rgvfuqvkyq) zoijcleaowVar2.f107468yggfygwlhe;
            zoijcleaowVar = (t.zoijcleaow) zoijcleaowVar2.f107469zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objYggfygwlhe);
            if (((Boolean) objYggfygwlhe).booleanValue()) {
                listPpxfxbqfkf = zoijcleaowVar.b().ppxfxbqfkf();
                size = listPpxfxbqfkf.size();
                while (i15 < size) {
                    pmvmpeibljVar = (t.pmvmpeiblj) listPpxfxbqfkf.get(i15);
                    if (t.vdvldrhtss.ppxfxbqfkf(pmvmpeibljVar)) {
                        pmvmpeibljVar.iobyxmoadg();
                    }
                    i15++;
                }
            }
            rgvfuqvkyqVar.zoijcleaow();
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ylkuphrtabVar = (kotlin.jvm.internal.ylkuphrtab) zoijcleaowVar2.f107467jyumaefscl;
            rgvfuqvkyqVar = (rgvfuqvkyq) zoijcleaowVar2.f107468yggfygwlhe;
            zoijcleaowVar3 = (t.zoijcleaow) zoijcleaowVar2.f107469zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objYggfygwlhe);
            if (((Boolean) objYggfygwlhe).booleanValue() && ylkuphrtabVar.f60038zdlpuopuiu) {
                listPpxfxbqfkf2 = zoijcleaowVar3.b().ppxfxbqfkf();
                size2 = listPpxfxbqfkf2.size();
                while (i15 < size2) {
                    pmvmpeibljVar2 = (t.pmvmpeiblj) listPpxfxbqfkf2.get(i15);
                    if (t.vdvldrhtss.ppxfxbqfkf(pmvmpeibljVar2)) {
                        pmvmpeibljVar2.iobyxmoadg();
                    }
                    i15++;
                }
            }
            rgvfuqvkyqVar.zoijcleaow();
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f A[LOOP:0: B:19:0x0050->B:23:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object nufgyqmvbu(t.zoijcleaow r7, lg.gxszxtbevo r8) {
        /*
            boolean r0 = r8 instanceof skhdrjzrfn.jlmebxxoox.iobyxmoadg
            if (r0 == 0) goto L13
            r0 = r8
            skhdrjzrfn.jlmebxxoox$iobyxmoadg r0 = (skhdrjzrfn.jlmebxxoox.iobyxmoadg) r0
            int r1 = r0.f107450jyumaefscl
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f107450jyumaefscl = r1
            goto L18
        L13:
            skhdrjzrfn.jlmebxxoox$iobyxmoadg r0 = new skhdrjzrfn.jlmebxxoox$iobyxmoadg
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f107451yggfygwlhe
            java.lang.Object r1 = mg.zoijcleaow.gxszxtbevo()
            int r2 = r0.f107450jyumaefscl
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f107452zdlpuopuiu
            t.zoijcleaow r7 = (t.zoijcleaow) r7
            gg.zdlpuopuiu.zoijcleaow(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            gg.zdlpuopuiu.zoijcleaow(r8)
        L38:
            t.oxmwwwfdhm r8 = t.oxmwwwfdhm.Main
            r0.f107452zdlpuopuiu = r7
            r0.f107450jyumaefscl = r3
            java.lang.Object r8 = r7.yzdjzghtvl(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            t.rgvfuqvkyq r8 = (t.rgvfuqvkyq) r8
            java.util.List r2 = r8.ppxfxbqfkf()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            t.pmvmpeiblj r6 = (t.pmvmpeiblj) r6
            boolean r6 = t.vdvldrhtss.zoijcleaow(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: skhdrjzrfn.jlmebxxoox.nufgyqmvbu(t.zoijcleaow, lg.gxszxtbevo):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00a9 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c4 A[Catch: CancellationException -> 0x0035, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce A[Catch: CancellationException -> 0x0035, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0035, blocks: (B:13:0x0031, B:33:0x00a1, B:35:0x00a9, B:37:0x00b8, B:39:0x00c4, B:40:0x00c7, B:41:0x00ca, B:42:0x00ce, B:20:0x004c, B:26:0x0073, B:28:0x0077, B:30:0x0081, B:23:0x0056), top: B:47:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object ojitshcjhn(t.zoijcleaow zoijcleaowVar, final opjhrmiecq.c cVar, t.rgvfuqvkyq rgvfuqvkyqVar, lg.gxszxtbevo gxszxtbevoVar) {
        wkgbmnqykc wkgbmnqykcVar;
        t.pmvmpeiblj pmvmpeibljVar;
        List listPpxfxbqfkf;
        int size;
        int i13;
        t.pmvmpeiblj pmvmpeibljVar2;
        if (gxszxtbevoVar instanceof wkgbmnqykc) {
            wkgbmnqykcVar = (wkgbmnqykc) gxszxtbevoVar;
            int i14 = wkgbmnqykcVar.f107460cqumvgiudr;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wkgbmnqykcVar.f107460cqumvgiudr = i14 - Integer.MIN_VALUE;
            } else {
                wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
            }
        } else {
            wkgbmnqykcVar = new wkgbmnqykc(gxszxtbevoVar);
        }
        Object objDxjokdxxww = wkgbmnqykcVar.f107461iwizpuwonk;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i15 = wkgbmnqykcVar.f107460cqumvgiudr;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    t.pmvmpeiblj pmvmpeibljVar3 = (t.pmvmpeiblj) wkgbmnqykcVar.f107462jyumaefscl;
                    cVar = (opjhrmiecq.c) wkgbmnqykcVar.f107463yggfygwlhe;
                    t.zoijcleaow zoijcleaowVar2 = (t.zoijcleaow) wkgbmnqykcVar.f107464zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
                    pmvmpeibljVar = pmvmpeibljVar3;
                    zoijcleaowVar = zoijcleaowVar2;
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (opjhrmiecq.c) wkgbmnqykcVar.f107463yggfygwlhe;
                    zoijcleaowVar = (t.zoijcleaow) wkgbmnqykcVar.f107464zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
                }
                if (((Boolean) objDxjokdxxww).booleanValue()) {
                    listPpxfxbqfkf = zoijcleaowVar.b().ppxfxbqfkf();
                    size = listPpxfxbqfkf.size();
                    for (i13 = 0; i13 < size; i13++) {
                        pmvmpeibljVar2 = (t.pmvmpeiblj) listPpxfxbqfkf.get(i13);
                        if (t.vdvldrhtss.ppxfxbqfkf(pmvmpeibljVar2)) {
                            pmvmpeibljVar2.iobyxmoadg();
                        }
                    }
                    cVar.onStop();
                } else {
                    cVar.onCancel();
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(objDxjokdxxww);
            pmvmpeibljVar = (t.pmvmpeiblj) hg.jyumaefscl.opjhrmiecq(rgvfuqvkyqVar.ppxfxbqfkf());
            long jGxszxtbevo = pmvmpeibljVar.gxszxtbevo();
            wkgbmnqykcVar.f107464zdlpuopuiu = zoijcleaowVar;
            wkgbmnqykcVar.f107463yggfygwlhe = cVar;
            wkgbmnqykcVar.f107462jyumaefscl = pmvmpeibljVar;
            wkgbmnqykcVar.f107460cqumvgiudr = 1;
            objDxjokdxxww = jztzpxfvev.jyumaefscl.dxjokdxxww(zoijcleaowVar, jGxszxtbevo, wkgbmnqykcVar);
            if (objDxjokdxxww == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            t.pmvmpeiblj pmvmpeibljVar4 = (t.pmvmpeiblj) objDxjokdxxww;
            if (pmvmpeibljVar4 != null && dxjokdxxww(zoijcleaowVar.getViewConfiguration(), pmvmpeibljVar, pmvmpeibljVar4)) {
                cVar.zoijcleaow(pmvmpeibljVar4.nufgyqmvbu());
                long jGxszxtbevo2 = pmvmpeibljVar4.gxszxtbevo();
                tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: skhdrjzrfn.ulzqkzuiru
                    @Override // tg.draadjrbmk
                    public final Object invoke(Object obj) {
                        return jlmebxxoox.rgvfuqvkyq(cVar, (t.pmvmpeiblj) obj);
                    }
                };
                wkgbmnqykcVar.f107464zdlpuopuiu = zoijcleaowVar;
                wkgbmnqykcVar.f107463yggfygwlhe = cVar;
                wkgbmnqykcVar.f107462jyumaefscl = null;
                wkgbmnqykcVar.f107460cqumvgiudr = 2;
                objDxjokdxxww = jztzpxfvev.jyumaefscl.yggfygwlhe(zoijcleaowVar, jGxszxtbevo2, draadjrbmkVar, wkgbmnqykcVar);
                if (objDxjokdxxww == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                if (((Boolean) objDxjokdxxww).booleanValue()) {
                    listPpxfxbqfkf = zoijcleaowVar.b().ppxfxbqfkf();
                    size = listPpxfxbqfkf.size();
                    while (i13 < size) {
                        pmvmpeibljVar2 = (t.pmvmpeiblj) listPpxfxbqfkf.get(i13);
                        if (t.vdvldrhtss.ppxfxbqfkf(pmvmpeibljVar2)) {
                            pmvmpeibljVar2.iobyxmoadg();
                        }
                    }
                    cVar.onStop();
                } else {
                    cVar.onCancel();
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        } catch (CancellationException e13) {
            cVar.onCancel();
            throw e13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn rgvfuqvkyq(opjhrmiecq.c cVar, t.pmvmpeiblj pmvmpeibljVar) {
        cVar.wkgbmnqykc(t.vdvldrhtss.lqeggnwhkg(pmvmpeibljVar));
        pmvmpeibljVar.iobyxmoadg();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final androidx.compose.ui.wkgbmnqykc vdvldrhtss(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, tg.draadjrbmk draadjrbmkVar) {
        return t.tzroggbefp.ppxfxbqfkf(wkgbmnqykcVar, 8675309, new eablkybsjg(draadjrbmkVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn wflxmlrfwp(rgvfuqvkyq rgvfuqvkyqVar, kegysxyocb kegysxyocbVar, kotlin.jvm.internal.ylkuphrtab ylkuphrtabVar, t.pmvmpeiblj pmvmpeibljVar) {
        if (rgvfuqvkyqVar.eablkybsjg(pmvmpeibljVar.nufgyqmvbu(), kegysxyocbVar)) {
            pmvmpeibljVar.iobyxmoadg();
            ylkuphrtabVar.f60038zdlpuopuiu = true;
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
