package lm;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import lk.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
final class lqeggnwhkg extends ppxfxbqfkf.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Executor f63458iobyxmoadg;

    class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Type f63459iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ Executor f63461zoijcleaow;

        iobyxmoadg(Type type, Executor executor) {
            this.f63459iobyxmoadg = type;
            this.f63461zoijcleaow = executor;
        }

        @Override // lm.ppxfxbqfkf
        public Type iobyxmoadg() {
            return this.f63459iobyxmoadg;
        }

        @Override // lm.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public lm.zoijcleaow zoijcleaow(lm.zoijcleaow zoijcleaowVar) {
            Executor executor = this.f63461zoijcleaow;
            return executor == null ? zoijcleaowVar : new zoijcleaow(executor, zoijcleaowVar);
        }
    }

    static final class zoijcleaow implements lm.zoijcleaow {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final lm.zoijcleaow f63462yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final Executor f63463zdlpuopuiu;

        class iobyxmoadg implements wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f63464iobyxmoadg;

            iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
                this.f63464iobyxmoadg = wkgbmnqykcVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void eablkybsjg(wkgbmnqykc wkgbmnqykcVar, Throwable th2) {
                wkgbmnqykcVar.zoijcleaow(zoijcleaow.this, th2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void gxszxtbevo(wkgbmnqykc wkgbmnqykcVar, kcexrzcfyt kcexrzcfytVar) {
                if (zoijcleaow.this.f63462yggfygwlhe.btonecajqb()) {
                    wkgbmnqykcVar.zoijcleaow(zoijcleaow.this, new IOException("Canceled"));
                } else {
                    wkgbmnqykcVar.iobyxmoadg(zoijcleaow.this, kcexrzcfytVar);
                }
            }

            @Override // lm.wkgbmnqykc
            public void iobyxmoadg(lm.zoijcleaow zoijcleaowVar, final kcexrzcfyt kcexrzcfytVar) {
                Executor executor = zoijcleaow.this.f63463zdlpuopuiu;
                final wkgbmnqykc wkgbmnqykcVar = this.f63464iobyxmoadg;
                executor.execute(new Runnable() { // from class: lm.nufgyqmvbu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63468zdlpuopuiu.gxszxtbevo(wkgbmnqykcVar, kcexrzcfytVar);
                    }
                });
            }

            @Override // lm.wkgbmnqykc
            public void zoijcleaow(lm.zoijcleaow zoijcleaowVar, final Throwable th2) {
                Executor executor = zoijcleaow.this.f63463zdlpuopuiu;
                final wkgbmnqykc wkgbmnqykcVar = this.f63464iobyxmoadg;
                executor.execute(new Runnable() { // from class: lm.dxjokdxxww
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f63436zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, th2);
                    }
                });
            }
        }

        zoijcleaow(Executor executor, lm.zoijcleaow zoijcleaowVar) {
            this.f63463zdlpuopuiu = executor;
            this.f63462yggfygwlhe = zoijcleaowVar;
        }

        @Override // lm.zoijcleaow
        public boolean btonecajqb() {
            return this.f63462yggfygwlhe.btonecajqb();
        }

        @Override // lm.zoijcleaow
        public void cancel() {
            this.f63462yggfygwlhe.cancel();
        }

        @Override // lm.zoijcleaow
        public zynmafqrjb dxjokdxxww() {
            return this.f63462yggfygwlhe.dxjokdxxww();
        }

        @Override // lm.zoijcleaow
        public void m(wkgbmnqykc wkgbmnqykcVar) {
            Objects.requireNonNull(wkgbmnqykcVar, "callback == null");
            this.f63462yggfygwlhe.m(new iobyxmoadg(wkgbmnqykcVar));
        }

        @Override // lm.zoijcleaow
        public lm.zoijcleaow clone() {
            return new zoijcleaow(this.f63463zdlpuopuiu, this.f63462yggfygwlhe.clone());
        }
    }

    lqeggnwhkg(Executor executor) {
        this.f63458iobyxmoadg = executor;
    }

    @Override // lm.ppxfxbqfkf.iobyxmoadg
    public ppxfxbqfkf iobyxmoadg(Type type, Annotation[] annotationArr, zdlpuopuiu zdlpuopuiuVar) {
        if (ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(type) != lm.zoijcleaow.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new iobyxmoadg(cqumvgiudr.lqeggnwhkg(0, (ParameterizedType) type), cqumvgiudr.draadjrbmk(annotationArr, jyumaefscl.class) ? null : this.f63458iobyxmoadg);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
