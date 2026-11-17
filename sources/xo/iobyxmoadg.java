package xo;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements to.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final pkzmftpjix f122958yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wo.iobyxmoadg f122959zdlpuopuiu;

    /* JADX INFO: renamed from: xo.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C3101iobyxmoadg extends ft.iobyxmoadg {
        C3101iobyxmoadg(pkzmftpjix pkzmftpjixVar) {
            super(pkzmftpjixVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ft.iobyxmoadg
        /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
        public lqeggnwhkg iobyxmoadg(wwaezpbzkn parameters) {
            zdlpuopuiu.btonecajqb(parameters, "parameters");
            return iobyxmoadg.this.f122959zdlpuopuiu.zoijcleaow();
        }
    }

    public iobyxmoadg(wo.iobyxmoadg authEventsObserver, pkzmftpjix coroutineDispatcher) {
        zdlpuopuiu.btonecajqb(authEventsObserver, "authEventsObserver");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f122959zdlpuopuiu = authEventsObserver;
        this.f122958yggfygwlhe = coroutineDispatcher;
    }

    @Override // tg.draadjrbmk
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public lqeggnwhkg invoke(wwaezpbzkn params) {
        zdlpuopuiu.btonecajqb(params, "params");
        return new C3101iobyxmoadg(this.f122958yggfygwlhe).zoijcleaow(params);
    }
}
