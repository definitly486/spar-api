package q6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rgvfuqvkyq {

    class iobyxmoadg implements androidx.lifecycle.zynmafqrjb {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.esjtqupxsv f77957cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ ojitshcjhn.iobyxmoadg f77958iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ Object f77959jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ r6.zoijcleaow f77960yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f77961zdlpuopuiu = null;

        /* JADX INFO: renamed from: q6.rgvfuqvkyq$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        class RunnableC1742iobyxmoadg implements Runnable {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ Object f77963zdlpuopuiu;

            RunnableC1742iobyxmoadg(Object obj) {
                this.f77963zdlpuopuiu = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (iobyxmoadg.this.f77959jyumaefscl) {
                    try {
                        Object objApply = iobyxmoadg.this.f77958iwizpuwonk.apply(this.f77963zdlpuopuiu);
                        iobyxmoadg iobyxmoadgVar = iobyxmoadg.this;
                        Object obj = iobyxmoadgVar.f77961zdlpuopuiu;
                        if (obj == null && objApply != null) {
                            iobyxmoadgVar.f77961zdlpuopuiu = objApply;
                            iobyxmoadgVar.f77957cqumvgiudr.wflxmlrfwp(objApply);
                        } else if (obj != null && !obj.equals(objApply)) {
                            iobyxmoadg iobyxmoadgVar2 = iobyxmoadg.this;
                            iobyxmoadgVar2.f77961zdlpuopuiu = objApply;
                            iobyxmoadgVar2.f77957cqumvgiudr.wflxmlrfwp(objApply);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        iobyxmoadg(r6.zoijcleaow zoijcleaowVar, Object obj, ojitshcjhn.iobyxmoadg iobyxmoadgVar, androidx.lifecycle.esjtqupxsv esjtqupxsvVar) {
            this.f77960yggfygwlhe = zoijcleaowVar;
            this.f77959jyumaefscl = obj;
            this.f77958iwizpuwonk = iobyxmoadgVar;
            this.f77957cqumvgiudr = esjtqupxsvVar;
        }

        @Override // androidx.lifecycle.zynmafqrjb
        public void iobyxmoadg(Object obj) {
            this.f77960yggfygwlhe.wkgbmnqykc(new RunnableC1742iobyxmoadg(obj));
        }
    }

    public static androidx.lifecycle.cqumvgiudr iobyxmoadg(androidx.lifecycle.cqumvgiudr cqumvgiudrVar, ojitshcjhn.iobyxmoadg iobyxmoadgVar, r6.zoijcleaow zoijcleaowVar) {
        Object obj = new Object();
        androidx.lifecycle.esjtqupxsv esjtqupxsvVar = new androidx.lifecycle.esjtqupxsv();
        esjtqupxsvVar.rgvfuqvkyq(cqumvgiudrVar, new iobyxmoadg(zoijcleaowVar, obj, iobyxmoadgVar, esjtqupxsvVar));
        return esjtqupxsvVar;
    }
}
