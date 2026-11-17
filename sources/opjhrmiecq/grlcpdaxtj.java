package opjhrmiecq;

/* JADX INFO: loaded from: classes.dex */
public abstract class grlcpdaxtj {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ c f73559iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ t.ylkuphrtab f73560jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f73561yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f73562zdlpuopuiu;

        /* JADX INFO: renamed from: opjhrmiecq.grlcpdaxtj$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1607iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ c f73563jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ t.ylkuphrtab f73564yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f73565zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1607iobyxmoadg(t.ylkuphrtab ylkuphrtabVar, c cVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f73564yggfygwlhe = ylkuphrtabVar;
                this.f73563jyumaefscl = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new C1607iobyxmoadg(this.f73564yggfygwlhe, this.f73563jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f73565zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    t.ylkuphrtab ylkuphrtabVar = this.f73564yggfygwlhe;
                    c cVar = this.f73563jyumaefscl;
                    this.f73565zdlpuopuiu = 1;
                    if (grlcpdaxtj.wflxmlrfwp(ylkuphrtabVar, cVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((C1607iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ c f73566jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ t.ylkuphrtab f73567yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f73568zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(t.ylkuphrtab ylkuphrtabVar, c cVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f73567yggfygwlhe = ylkuphrtabVar;
                this.f73566jyumaefscl = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f73567yggfygwlhe, this.f73566jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f73568zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    t.ylkuphrtab ylkuphrtabVar = this.f73567yggfygwlhe;
                    c cVar = this.f73566jyumaefscl;
                    this.f73568zdlpuopuiu = 1;
                    if (grlcpdaxtj.nufgyqmvbu(ylkuphrtabVar, cVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
                return ((zoijcleaow) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(t.ylkuphrtab ylkuphrtabVar, c cVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73560jyumaefscl = ylkuphrtabVar;
            this.f73559iwizpuwonk = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f73560jyumaefscl, this.f73559iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f73561yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f73562zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            pj.cllcsxoeiz cllcsxoeizVar = (pj.cllcsxoeiz) this.f73561yggfygwlhe;
            pj.wypolnanlu wypolnanluVar = pj.wypolnanlu.UNDISPATCHED;
            pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, wypolnanluVar, new C1607iobyxmoadg(this.f73560jyumaefscl, this.f73559iwizpuwonk, null), 1, null);
            return pj.gtknphoqwx.wkgbmnqykc(cllcsxoeizVar, null, wypolnanluVar, new zoijcleaow(this.f73560jyumaefscl, this.f73559iwizpuwonk, null), 1, null);
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(pj.cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ c f73569cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private /* synthetic */ Object f73570iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f73571jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f73572yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(c cVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f73569cqumvgiudr = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f73569cqumvgiudr, gxszxtbevoVar);
            zoijcleaowVar.f73570iwizpuwonk = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x006b  */
        /* JADX WARN: Code duplicated, block: B:21:0x007f  */
        /* JADX WARN: Code duplicated, block: B:27:0x0089 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x0086 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005b -> B:17:0x005e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:29:0x0086
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = mg.zoijcleaow.gxszxtbevo()
                int r1 = r12.f73571jyumaefscl
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r12.f73572yggfygwlhe
                t.pmvmpeiblj r1 = (t.pmvmpeiblj) r1
                java.lang.Object r4 = r12.f73570iwizpuwonk
                t.zoijcleaow r4 = (t.zoijcleaow) r4
                gg.zdlpuopuiu.zoijcleaow(r13)
                goto L5e
            L1a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L22:
                java.lang.Object r1 = r12.f73570iwizpuwonk
                t.zoijcleaow r1 = (t.zoijcleaow) r1
                gg.zdlpuopuiu.zoijcleaow(r13)
                goto L43
            L2a:
                gg.zdlpuopuiu.zoijcleaow(r13)
                java.lang.Object r13 = r12.f73570iwizpuwonk
                r1 = r13
                t.zoijcleaow r1 = (t.zoijcleaow) r1
                r12.f73570iwizpuwonk = r1
                r12.f73571jyumaefscl = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = jztzpxfvev.nuxfzjnpeb.gxszxtbevo(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L43
                return r0
            L43:
                t.pmvmpeiblj r13 = (t.pmvmpeiblj) r13
                opjhrmiecq.c r4 = r12.f73569cqumvgiudr
                long r5 = r13.nufgyqmvbu()
                r4.iobyxmoadg(r5)
                r4 = r1
                r1 = r13
            L50:
                r12.f73570iwizpuwonk = r4
                r12.f73572yggfygwlhe = r1
                r12.f73571jyumaefscl = r2
                r13 = 0
                java.lang.Object r13 = t.zoijcleaow.o(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L5e
                return r0
            L5e:
                t.rgvfuqvkyq r13 = (t.rgvfuqvkyq) r13
                java.util.List r13 = r13.ppxfxbqfkf()
                int r5 = r13.size()
                r6 = 0
            L69:
                if (r6 >= r5) goto L89
                java.lang.Object r7 = r13.get(r6)
                t.pmvmpeiblj r7 = (t.pmvmpeiblj) r7
                long r8 = r7.gxszxtbevo()
                long r10 = r1.gxszxtbevo()
                boolean r8 = t.lereixgezr.zoijcleaow(r8, r10)
                if (r8 == 0) goto L86
                boolean r7 = r7.dxjokdxxww()
                if (r7 == 0) goto L86
                goto L50
            L86:
                int r6 = r6 + 1
                goto L69
            L89:
                opjhrmiecq.c r13 = r12.f73569cqumvgiudr
                r13.ppxfxbqfkf()
                gg.wwaezpbzkn r13 = gg.wwaezpbzkn.f37140iobyxmoadg
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: opjhrmiecq.grlcpdaxtj.zoijcleaow.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t.zoijcleaow zoijcleaowVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(zoijcleaowVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn btonecajqb(c cVar) {
        cVar.onStop();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn draadjrbmk(c cVar, t.pmvmpeiblj pmvmpeibljVar, g.eablkybsjg eablkybsjgVar) {
        cVar.wkgbmnqykc(eablkybsjgVar.zdlpuopuiu());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn dxjokdxxww(c cVar, g.eablkybsjg eablkybsjgVar) {
        cVar.zoijcleaow(eablkybsjgVar.zdlpuopuiu());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn gtknphoqwx(c cVar) {
        cVar.onCancel();
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final Object lqeggnwhkg(t.ylkuphrtab ylkuphrtabVar, c cVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objGxszxtbevo = pj.dsvhmnatus.gxszxtbevo(new iobyxmoadg(ylkuphrtabVar, cVar, null), gxszxtbevoVar);
        return objGxszxtbevo == mg.zoijcleaow.gxszxtbevo() ? objGxszxtbevo : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nufgyqmvbu(t.ylkuphrtab ylkuphrtabVar, final c cVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objDraadjrbmk = jztzpxfvev.jyumaefscl.draadjrbmk(ylkuphrtabVar, new tg.draadjrbmk() { // from class: opjhrmiecq.fiwbwshyhd
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return grlcpdaxtj.dxjokdxxww(cVar, (g.eablkybsjg) obj);
            }
        }, new tg.iobyxmoadg() { // from class: opjhrmiecq.ageimvtcrz
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return grlcpdaxtj.btonecajqb(cVar);
            }
        }, new tg.iobyxmoadg() { // from class: opjhrmiecq.fyldjkxazc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return grlcpdaxtj.gtknphoqwx(cVar);
            }
        }, new tg.rgvfuqvkyq() { // from class: opjhrmiecq.ipoelvxyzq
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return grlcpdaxtj.draadjrbmk(cVar, (t.pmvmpeiblj) obj, (g.eablkybsjg) obj2);
            }
        }, gxszxtbevoVar);
        return objDraadjrbmk == mg.zoijcleaow.gxszxtbevo() ? objDraadjrbmk : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object wflxmlrfwp(t.ylkuphrtab ylkuphrtabVar, c cVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objWkgbmnqykc = jztzpxfvev.cllcsxoeiz.wkgbmnqykc(ylkuphrtabVar, new zoijcleaow(cVar, null), gxszxtbevoVar);
        return objWkgbmnqykc == mg.zoijcleaow.gxszxtbevo() ? objWkgbmnqykc : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
