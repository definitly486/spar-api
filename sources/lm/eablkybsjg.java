package lm;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
final class eablkybsjg extends lm.ppxfxbqfkf.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    static final lm.ppxfxbqfkf.iobyxmoadg f63437iobyxmoadg = new eablkybsjg();

    private static final class iobyxmoadg implements lm.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Type f63438iobyxmoadg;

        /* JADX INFO: renamed from: lm.eablkybsjg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        private class C1293iobyxmoadg implements wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final CompletableFuture f63439iobyxmoadg;

            public C1293iobyxmoadg(CompletableFuture completableFuture) {
                this.f63439iobyxmoadg = completableFuture;
            }

            @Override // lm.wkgbmnqykc
            public void iobyxmoadg(lm.zoijcleaow zoijcleaowVar, kcexrzcfyt kcexrzcfytVar) {
                if (kcexrzcfytVar.gxszxtbevo()) {
                    this.f63439iobyxmoadg.complete(kcexrzcfytVar.iobyxmoadg());
                } else {
                    this.f63439iobyxmoadg.completeExceptionally(new HttpException(kcexrzcfytVar));
                }
            }

            @Override // lm.wkgbmnqykc
            public void zoijcleaow(lm.zoijcleaow zoijcleaowVar, Throwable th2) {
                this.f63439iobyxmoadg.completeExceptionally(th2);
            }
        }

        iobyxmoadg(Type type) {
            this.f63438iobyxmoadg = type;
        }

        @Override // lm.ppxfxbqfkf
        public Type iobyxmoadg() {
            return this.f63438iobyxmoadg;
        }

        @Override // lm.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public CompletableFuture zoijcleaow(lm.zoijcleaow zoijcleaowVar) {
            zoijcleaow zoijcleaowVar2 = new zoijcleaow(zoijcleaowVar);
            zoijcleaowVar.m(new C1293iobyxmoadg(zoijcleaowVar2));
            return zoijcleaowVar2;
        }
    }

    private static final class ppxfxbqfkf implements lm.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Type f63441iobyxmoadg;

        private class iobyxmoadg implements wkgbmnqykc {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            private final CompletableFuture f63442iobyxmoadg;

            public iobyxmoadg(CompletableFuture completableFuture) {
                this.f63442iobyxmoadg = completableFuture;
            }

            @Override // lm.wkgbmnqykc
            public void iobyxmoadg(lm.zoijcleaow zoijcleaowVar, kcexrzcfyt kcexrzcfytVar) {
                this.f63442iobyxmoadg.complete(kcexrzcfytVar);
            }

            @Override // lm.wkgbmnqykc
            public void zoijcleaow(lm.zoijcleaow zoijcleaowVar, Throwable th2) {
                this.f63442iobyxmoadg.completeExceptionally(th2);
            }
        }

        ppxfxbqfkf(Type type) {
            this.f63441iobyxmoadg = type;
        }

        @Override // lm.ppxfxbqfkf
        public Type iobyxmoadg() {
            return this.f63441iobyxmoadg;
        }

        @Override // lm.ppxfxbqfkf
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public CompletableFuture zoijcleaow(lm.zoijcleaow zoijcleaowVar) {
            zoijcleaow zoijcleaowVar2 = new zoijcleaow(zoijcleaowVar);
            zoijcleaowVar.m(new iobyxmoadg(zoijcleaowVar2));
            return zoijcleaowVar2;
        }
    }

    private static final class zoijcleaow extends CompletableFuture {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final lm.zoijcleaow f63444zdlpuopuiu;

        zoijcleaow(lm.zoijcleaow zoijcleaowVar) {
            this.f63444zdlpuopuiu = zoijcleaowVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z13) {
            if (z13) {
                this.f63444zdlpuopuiu.cancel();
            }
            return super.cancel(z13);
        }
    }

    eablkybsjg() {
    }

    @Override // lm.ppxfxbqfkf.iobyxmoadg
    public lm.ppxfxbqfkf iobyxmoadg(Type type, Annotation[] annotationArr, zdlpuopuiu zdlpuopuiuVar) {
        if (lm.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeZoijcleaow = lm.ppxfxbqfkf.iobyxmoadg.zoijcleaow(0, (ParameterizedType) type);
        if (lm.ppxfxbqfkf.iobyxmoadg.ppxfxbqfkf(typeZoijcleaow) != kcexrzcfyt.class) {
            return new iobyxmoadg(typeZoijcleaow);
        }
        if (typeZoijcleaow instanceof ParameterizedType) {
            return new ppxfxbqfkf(lm.ppxfxbqfkf.iobyxmoadg.zoijcleaow(0, (ParameterizedType) typeZoijcleaow));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
