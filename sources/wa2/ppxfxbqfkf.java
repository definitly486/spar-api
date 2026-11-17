package wa2;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.videoplayer.impl.domain.store.VideoPlayerStore$State;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends ws.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f119201btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f119202gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ru.myspar.videoplayer.impl.domain.store.iobyxmoadg store, ns.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f119201btonecajqb = new tg.draadjrbmk() { // from class: wa2.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((VideoPlayerStore$State) obj);
            }
        };
        this.f119202gtknphoqwx = new tg.draadjrbmk() { // from class: wa2.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((btonecajqb) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final va2.ppxfxbqfkf ntlheqmsrt(btonecajqb btonecajqbVar) {
        zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(btonecajqbVar, btonecajqb.iobyxmoadg.f119196iobyxmoadg)) {
            return va2.ppxfxbqfkf.iobyxmoadg.f116436iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gtknphoqwx sopmlzcsov(VideoPlayerStore$State videoPlayerStore$State) {
        zdlpuopuiu.btonecajqb(videoPlayerStore$State, "<this>");
        if (zdlpuopuiu.eablkybsjg(videoPlayerStore$State, VideoPlayerStore$State.Idle.f104660zdlpuopuiu)) {
            return gtknphoqwx.iobyxmoadg.f119199iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f119201btonecajqb;
    }

    @Override // ws.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f119202gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ws.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(va2.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, va2.wkgbmnqykc.iobyxmoadg.f116437iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        d40.iobyxmoadg.f26931iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
