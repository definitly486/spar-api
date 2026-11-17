package sflfametgt;

import jztzpxfvev.roivzttewh;

/* JADX INFO: loaded from: classes.dex */
final class czzsidtyhn implements jztzpxfvev.hkdspvbjdz {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final roivzttewh f106136iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ikoacuggdj f106137zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        int f106138jyumaefscl;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        /* synthetic */ Object f106140zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f106140zdlpuopuiu = obj;
            this.f106138jyumaefscl |= Integer.MIN_VALUE;
            return czzsidtyhn.this.iobyxmoadg(null, 0.0f, this);
        }
    }

    public czzsidtyhn(roivzttewh roivzttewhVar, ikoacuggdj ikoacuggdjVar) {
        this.f106136iobyxmoadg = roivzttewhVar;
        this.f106137zoijcleaow = ikoacuggdjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn eablkybsjg(czzsidtyhn czzsidtyhnVar, jztzpxfvev.xrmfcynszj xrmfcynszjVar, float f13) {
        czzsidtyhnVar.f106137zoijcleaow.nuxfzjnpeb(xrmfcynszjVar, vg.iobyxmoadg.wkgbmnqykc(czzsidtyhnVar.f106137zoijcleaow.jpowsppfya() != 0 ? f13 / czzsidtyhnVar.f106137zoijcleaow.jpowsppfya() : 0.0f) + czzsidtyhnVar.f106137zoijcleaow.cqumvgiudr());
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // jztzpxfvev.hkdspvbjdz
    public Object iobyxmoadg(final jztzpxfvev.xrmfcynszj xrmfcynszjVar, float f13, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f106138jyumaefscl;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f106138jyumaefscl = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f106140zdlpuopuiu;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f106138jyumaefscl;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            roivzttewh roivzttewhVar = this.f106136iobyxmoadg;
            tg.draadjrbmk draadjrbmkVar = new tg.draadjrbmk() { // from class: sflfametgt.rlfsiqarku
                @Override // tg.draadjrbmk
                public final Object invoke(Object obj) {
                    return czzsidtyhn.eablkybsjg(this.f106332zdlpuopuiu, xrmfcynszjVar, ((Float) obj).floatValue());
                }
            };
            iobyxmoadgVar.f106138jyumaefscl = 1;
            objPpxfxbqfkf = roivzttewhVar.ppxfxbqfkf(xrmfcynszjVar, f13, draadjrbmkVar, iobyxmoadgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        }
        float fFloatValue = ((Number) objPpxfxbqfkf).floatValue();
        if (this.f106137zoijcleaow.esjtqupxsv() != 0.0f && Math.abs(this.f106137zoijcleaow.esjtqupxsv()) < 0.001d) {
            ikoacuggdj ikoacuggdjVar = this.f106137zoijcleaow;
            ikoacuggdj.jztzpxfvev(ikoacuggdjVar, ikoacuggdjVar.cqumvgiudr(), 0.0f, 2, null);
        } else {
            kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(this.f106137zoijcleaow.esjtqupxsv());
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.ppxfxbqfkf(fFloatValue);
    }
}
