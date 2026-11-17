package androidx.compose.runtime;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class y0 {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ sj.lqeggnwhkg f6100iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ lg.btonecajqb f6101jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f6102yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f6103zdlpuopuiu;

        /* JADX INFO: renamed from: androidx.compose.runtime.y0$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C0107iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ eslsurpljm f6104zdlpuopuiu;

            C0107iobyxmoadg(eslsurpljm eslsurpljmVar) {
                this.f6104zdlpuopuiu = eslsurpljmVar;
            }

            @Override // sj.nufgyqmvbu
            public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                this.f6104zdlpuopuiu.setValue(obj);
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ eslsurpljm f6105jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ sj.lqeggnwhkg f6106yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f6107zdlpuopuiu;

            /* JADX INFO: renamed from: androidx.compose.runtime.y0$iobyxmoadg$zoijcleaow$iobyxmoadg, reason: collision with other inner class name */
            static final class C0108iobyxmoadg implements sj.nufgyqmvbu {

                /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
                final /* synthetic */ eslsurpljm f6108zdlpuopuiu;

                C0108iobyxmoadg(eslsurpljm eslsurpljmVar) {
                    this.f6108zdlpuopuiu = eslsurpljmVar;
                }

                @Override // sj.nufgyqmvbu
                public final Object emit(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                    this.f6108zdlpuopuiu.setValue(obj);
                    return gg.wwaezpbzkn.f37140iobyxmoadg;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar, eslsurpljm eslsurpljmVar, lg.gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f6106yggfygwlhe = lqeggnwhkgVar;
                this.f6105jyumaefscl = eslsurpljmVar;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
                return new zoijcleaow(this.f6106yggfygwlhe, this.f6105jyumaefscl, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
                int i13 = this.f6107zdlpuopuiu;
                if (i13 == 0) {
                    gg.zdlpuopuiu.zoijcleaow(obj);
                    sj.lqeggnwhkg lqeggnwhkgVar = this.f6106yggfygwlhe;
                    C0108iobyxmoadg c0108iobyxmoadg = new C0108iobyxmoadg(this.f6105jyumaefscl);
                    this.f6107zdlpuopuiu = 1;
                    if (lqeggnwhkgVar.collect(c0108iobyxmoadg, this) == objGxszxtbevo) {
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
        iobyxmoadg(lg.btonecajqb btonecajqbVar, sj.lqeggnwhkg lqeggnwhkgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f6101jyumaefscl = btonecajqbVar;
            this.f6100iwizpuwonk = lqeggnwhkgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f6101jyumaefscl, this.f6100iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f6102yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f6103zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                eslsurpljm eslsurpljmVar = (eslsurpljm) this.f6102yggfygwlhe;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f6101jyumaefscl, lg.gtknphoqwx.f62507zdlpuopuiu)) {
                    sj.lqeggnwhkg lqeggnwhkgVar = this.f6100iwizpuwonk;
                    C0107iobyxmoadg c0107iobyxmoadg = new C0107iobyxmoadg(eslsurpljmVar);
                    this.f6103zdlpuopuiu = 1;
                    if (lqeggnwhkgVar.collect(c0107iobyxmoadg, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                } else {
                    lg.btonecajqb btonecajqbVar = this.f6101jyumaefscl;
                    zoijcleaow zoijcleaowVar = new zoijcleaow(this.f6100iwizpuwonk, eslsurpljmVar, null);
                    this.f6103zdlpuopuiu = 2;
                    if (pj.dxjokdxxww.lqeggnwhkg(btonecajqbVar, zoijcleaowVar, this) == objGxszxtbevo) {
                        return objGxszxtbevo;
                    }
                }
            } else {
                if (i13 != 1 && i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(eslsurpljm eslsurpljmVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(eslsurpljmVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        Object f6109cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        int f6110esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        Object f6111iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        Object f6112jyumaefscl;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        int f6113lereixgezr;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private /* synthetic */ Object f6114pmvmpeiblj;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        Object f6115yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f6116zdlpuopuiu;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f6117zynmafqrjb;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f6117zynmafqrjb = iobyxmoadgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:20:0x005a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x005c A[LOOP:0: B:7:0x0019->B:21:0x005c, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:40:0x0091 A[SYNTHETIC] */
        public static final gg.wwaezpbzkn jyumaefscl(rj.lqeggnwhkg lqeggnwhkgVar, Set set, androidx.compose.runtime.snapshots.lqeggnwhkg lqeggnwhkgVar2) {
            if (set instanceof ipoelvxyzq.eablkybsjg) {
                androidx.collection.vipkmwdibw vipkmwdibwVarIobyxmoadg = ((ipoelvxyzq.eablkybsjg) set).iobyxmoadg();
                Object[] objArr = vipkmwdibwVarIobyxmoadg.f4398zoijcleaow;
                long[] jArr = vipkmwdibwVarIobyxmoadg.f4395iobyxmoadg;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i13 = 0;
                    loop0: while (true) {
                        long j13 = jArr[i13];
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i14 = 8 - ((~(i13 - length)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((255 & j13) < 128) {
                                    Object obj = objArr[(i13 << 3) + i15];
                                    if (!(obj instanceof yzdjzghtvl.pmvmpeiblj) || ((yzdjzghtvl.pmvmpeiblj) obj).jlmebxxoox(androidx.compose.runtime.snapshots.eablkybsjg.iobyxmoadg(4))) {
                                        break loop0;
                                    }
                                }
                                j13 >>= 8;
                            }
                            if (i14 == 8) {
                                if (i13 != length) {
                                    i13++;
                                }
                            }
                        } else if (i13 != length) {
                            i13++;
                        }
                    }
                    lqeggnwhkgVar.eablkybsjg(set);
                }
            } else {
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (Object obj2 : set2) {
                        if (!(obj2 instanceof yzdjzghtvl.pmvmpeiblj) || ((yzdjzghtvl.pmvmpeiblj) obj2).jlmebxxoox(androidx.compose.runtime.snapshots.eablkybsjg.iobyxmoadg(4))) {
                            lqeggnwhkgVar.eablkybsjg(set);
                        }
                    }
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn yggfygwlhe(androidx.collection.wypolnanlu wypolnanluVar, Object obj) {
            if (obj instanceof yzdjzghtvl.pmvmpeiblj) {
                ((yzdjzghtvl.pmvmpeiblj) obj).ribwqtqdhb(androidx.compose.runtime.snapshots.eablkybsjg.iobyxmoadg(4));
            }
            wypolnanluVar.nufgyqmvbu(obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f6117zynmafqrjb, gxszxtbevoVar);
            zoijcleaowVar.f6114pmvmpeiblj = obj;
            return zoijcleaowVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e1 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x0118 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:32:0x00dd, B:34:0x00e1, B:39:0x00eb, B:42:0x00f9, B:46:0x010f, B:48:0x0118, B:56:0x0134, B:57:0x0137, B:15:0x0050, B:43:0x0104, B:45:0x010c, B:54:0x0130, B:55:0x0133), top: B:71:0x0050, inners: #2 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x012c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0139  */
        /* JADX WARN: Path cross not found for [B:42:0x00f9, B:58:0x0138], limit reached: 76 */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 334
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.y0.zoijcleaow.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
        public final Object invoke(sj.nufgyqmvbu nufgyqmvbuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(nufgyqmvbuVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final sj.lqeggnwhkg eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
        return sj.dxjokdxxww.wwaezpbzkn(new zoijcleaow(iobyxmoadgVar, null));
    }

    public static final i1 ppxfxbqfkf(sj.wypolnanlu wypolnanluVar, lg.btonecajqb btonecajqbVar, draadjrbmk draadjrbmkVar, int i13, int i14) {
        if ((i14 & 1) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        lg.btonecajqb btonecajqbVar2 = btonecajqbVar;
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1439883919, i13, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        i1 i1VarIobyxmoadg = v0.iobyxmoadg(wypolnanluVar, wypolnanluVar.getValue(), btonecajqbVar2, draadjrbmkVar, (i13 & 14) | ((i13 << 3) & 896), 0);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return i1VarIobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean wkgbmnqykc(androidx.collection.wypolnanlu wypolnanluVar, Set set) {
        Object[] objArr = wypolnanluVar.f4398zoijcleaow;
        long[] jArr = wypolnanluVar.f4395iobyxmoadg;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i13 = 0;
        while (true) {
            long j13 = jArr[i13];
            if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j13) < 128 && set.contains(objArr[(i13 << 3) + i15])) {
                        return true;
                    }
                    j13 >>= 8;
                }
                if (i14 != 8) {
                    return false;
                }
            }
            if (i13 == length) {
                return false;
            }
            i13++;
        }
    }

    public static final i1 zoijcleaow(sj.lqeggnwhkg lqeggnwhkgVar, Object obj, lg.btonecajqb btonecajqbVar, draadjrbmk draadjrbmkVar, int i13, int i14) {
        if ((i14 & 2) != 0) {
            btonecajqbVar = lg.gtknphoqwx.f62507zdlpuopuiu;
        }
        lg.btonecajqb btonecajqbVar2 = btonecajqbVar;
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-606625098, i13, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zLmojexxdyd = draadjrbmkVar.lmojexxdyd(btonecajqbVar2) | draadjrbmkVar.lmojexxdyd(lqeggnwhkgVar);
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        if (zLmojexxdyd || objYadqdtsiqt == draadjrbmk.f5569iobyxmoadg.iobyxmoadg()) {
            objYadqdtsiqt = new iobyxmoadg(btonecajqbVar2, lqeggnwhkgVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        i1 i1VarBtonecajqb = v0.btonecajqb(obj, lqeggnwhkgVar, btonecajqbVar2, (tg.rgvfuqvkyq) objYadqdtsiqt, draadjrbmkVar, ((i13 >> 3) & 14) | ((i13 << 3) & 112) | (i13 & 896));
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return i1VarBtonecajqb;
    }
}
