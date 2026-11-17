package tw1;

import androidx.lifecycle.pkzmftpjix;
import gg.wwaezpbzkn;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.videoplayer.impl.domain.store.VideoPlayerStore$State;

/* JADX INFO: loaded from: classes6.dex */
public final class ppxfxbqfkf extends pr0.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final tg.draadjrbmk f111629btonecajqb;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final tg.draadjrbmk f111630gtknphoqwx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(ru.myspar.proloyalty.videoplayer.impl.domain.store.iobyxmoadg store, dr0.iobyxmoadg dispatchersProvider, pkzmftpjix savedStateHandle) {
        super(store, dispatchersProvider, savedStateHandle);
        zdlpuopuiu.btonecajqb(store, "store");
        zdlpuopuiu.btonecajqb(dispatchersProvider, "dispatchersProvider");
        zdlpuopuiu.btonecajqb(savedStateHandle, "savedStateHandle");
        this.f111629btonecajqb = new tg.draadjrbmk() { // from class: tw1.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.sopmlzcsov((VideoPlayerStore$State) obj);
            }
        };
        this.f111630gtknphoqwx = new tg.draadjrbmk() { // from class: tw1.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ppxfxbqfkf.ntlheqmsrt((btonecajqb) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sw1.ppxfxbqfkf ntlheqmsrt(btonecajqb btonecajqbVar) {
        zdlpuopuiu.btonecajqb(btonecajqbVar, "<this>");
        if (zdlpuopuiu.eablkybsjg(btonecajqbVar, btonecajqb.iobyxmoadg.f111624iobyxmoadg)) {
            return sw1.ppxfxbqfkf.iobyxmoadg.f108610iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gtknphoqwx sopmlzcsov(VideoPlayerStore$State videoPlayerStore$State) {
        zdlpuopuiu.btonecajqb(videoPlayerStore$State, "<this>");
        if (zdlpuopuiu.eablkybsjg(videoPlayerStore$State, VideoPlayerStore$State.Idle.f102015zdlpuopuiu)) {
            return gtknphoqwx.iobyxmoadg.f111627iobyxmoadg;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk esjtqupxsv() {
        return this.f111629btonecajqb;
    }

    @Override // pr0.zoijcleaow
    protected tg.draadjrbmk iwizpuwonk() {
        return this.f111630gtknphoqwx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // pr0.zoijcleaow
    /* JADX INFO: renamed from: ulzqkzuiru, reason: merged with bridge method [inline-methods] */
    public Object lereixgezr(sw1.wkgbmnqykc wkgbmnqykcVar, lg.gxszxtbevo gxszxtbevoVar) {
        if (!zdlpuopuiu.eablkybsjg(wkgbmnqykcVar, sw1.wkgbmnqykc.iobyxmoadg.f108611iobyxmoadg)) {
            throw new NoWhenBranchMatchedException();
        }
        i21.iobyxmoadg.f41720iobyxmoadg.gtknphoqwx();
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
