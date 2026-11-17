package jztzpxfvev;

/* JADX INFO: loaded from: classes.dex */
public abstract class ikoacuggdj {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f52711jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f52712yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f52713zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f52712yggfygwlhe = obj;
            this.f52711jyumaefscl |= Integer.MIN_VALUE;
            return ikoacuggdj.iobyxmoadg(null, 0.0f, null, this);
        }
    }

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52714zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new ppxfxbqfkf(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f52714zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(xrmfcynszj xrmfcynszjVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((ppxfxbqfkf) create(xrmfcynszjVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.pkzmftpjix f52715cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ vipkmwdibw.gtknphoqwx f52716iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ float f52717jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f52718yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52719zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zoijcleaow(float f13, vipkmwdibw.gtknphoqwx gtknphoqwxVar, kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52717jyumaefscl = f13;
            this.f52716iwizpuwonk = gtknphoqwxVar;
            this.f52715cqumvgiudr = pkzmftpjixVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final gg.wwaezpbzkn zdlpuopuiu(kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar, xrmfcynszj xrmfcynszjVar, float f13, float f14) {
            float f15 = pkzmftpjixVar.f60030zdlpuopuiu;
            pkzmftpjixVar.f60030zdlpuopuiu = f15 + xrmfcynszjVar.wkgbmnqykc(f13 - f15);
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            zoijcleaow zoijcleaowVar = new zoijcleaow(this.f52717jyumaefscl, this.f52716iwizpuwonk, this.f52715cqumvgiudr, gxszxtbevoVar);
            zoijcleaowVar.f52718yggfygwlhe = obj;
            return zoijcleaowVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52719zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                final xrmfcynszj xrmfcynszjVar = (xrmfcynszj) this.f52718yggfygwlhe;
                float f13 = this.f52717jyumaefscl;
                vipkmwdibw.gtknphoqwx gtknphoqwxVar = this.f52716iwizpuwonk;
                final kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar = this.f52715cqumvgiudr;
                tg.rgvfuqvkyq rgvfuqvkyqVar = new tg.rgvfuqvkyq() { // from class: jztzpxfvev.okpsazkaxt
                    @Override // tg.rgvfuqvkyq
                    public final Object invoke(Object obj2, Object obj3) {
                        return ikoacuggdj.zoijcleaow.zdlpuopuiu(pkzmftpjixVar, xrmfcynszjVar, ((Float) obj2).floatValue(), ((Float) obj3).floatValue());
                    }
                };
                this.f52719zdlpuopuiu = 1;
                if (vipkmwdibw.tbqsvytpvh.wflxmlrfwp(0.0f, f13, 0.0f, gtknphoqwxVar, rgvfuqvkyqVar, this, 4, null) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: kcexrzcfyt, reason: merged with bridge method [inline-methods] */
        public final Object invoke(xrmfcynszj xrmfcynszjVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((zoijcleaow) create(xrmfcynszjVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object iobyxmoadg(opjhrmiecq opjhrmiecqVar, float f13, vipkmwdibw.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f52711jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f52711jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar;
        Object obj = iobyxmoadgVar2.f52712yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar2.f52711jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            kotlin.jvm.internal.pkzmftpjix pkzmftpjixVar2 = new kotlin.jvm.internal.pkzmftpjix();
            zoijcleaow zoijcleaowVar = new zoijcleaow(f13, gtknphoqwxVar, pkzmftpjixVar2, null);
            iobyxmoadgVar2.f52713zdlpuopuiu = pkzmftpjixVar2;
            iobyxmoadgVar2.f52711jyumaefscl = 1;
            if (opjhrmiecq.wkgbmnqykc(opjhrmiecqVar, null, zoijcleaowVar, iobyxmoadgVar2, 1, null) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            pkzmftpjixVar = pkzmftpjixVar2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pkzmftpjixVar = (kotlin.jvm.internal.pkzmftpjix) iobyxmoadgVar2.f52713zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(pkzmftpjixVar.f60030zdlpuopuiu);
    }

    public static final Object ppxfxbqfkf(opjhrmiecq opjhrmiecqVar, ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objZoijcleaow = opjhrmiecqVar.zoijcleaow(ribwqtqdhbVar, new ppxfxbqfkf(null), gxszxtbevoVar);
        return objZoijcleaow == mg.zoijcleaow.gxszxtbevo() ? objZoijcleaow : gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public static /* synthetic */ Object wkgbmnqykc(opjhrmiecq opjhrmiecqVar, ikoacuggdj.ribwqtqdhb ribwqtqdhbVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            ribwqtqdhbVar = ikoacuggdj.ribwqtqdhb.Default;
        }
        return ppxfxbqfkf(opjhrmiecqVar, ribwqtqdhbVar, gxszxtbevoVar);
    }

    public static /* synthetic */ Object zoijcleaow(opjhrmiecq opjhrmiecqVar, float f13, vipkmwdibw.gtknphoqwx gtknphoqwxVar, lg.gxszxtbevo gxszxtbevoVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            gtknphoqwxVar = vipkmwdibw.draadjrbmk.btonecajqb(0.0f, 0.0f, null, 7, null);
        }
        return iobyxmoadg(opjhrmiecqVar, f13, gtknphoqwxVar, gxszxtbevoVar);
    }
}
