package ru.myspar.videoplayer.impl.presentation;

import android.view.View;
import androidx.appcompat.app.yggfygwlhe;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.stevsuqkhv;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.jlmebxxoox;
import androidx.lifecycle.ribwqtqdhb;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.oxmwwwfdhm;
import gg.ojitshcjhn;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.cllcsxoeiz;
import kotlin.jvm.internal.istkbnxepw;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.vdvldrhtss;
import kotlin.jvm.internal.yadqdtsiqt;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.videoplayer.api.model.VideoPlayerArgs;
import ru.myspar.videoplayer.impl.presentation.VideoPlayerFragment;
import v2.esjtqupxsv;
import v2.kcexrzcfyt;
import wa2.agtfadlqog;
import wa2.btonecajqb;
import wa2.draadjrbmk;
import wa2.gtknphoqwx;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000o\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u00012\b\u0007\u0018\u0000 G2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001HB\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001b\u0010F\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006I"}, d2 = {"Lru/myspar/videoplayer/impl/presentation/VideoPlayerFragment;", "Lru/myspar/core/base/mvi/fragment/BaseMviFragment;", "Lwa2/gtknphoqwx;", "Lwa2/btonecajqb;", "Lwa2/draadjrbmk;", "<init>", "()V", "Lgg/wwaezpbzkn;", "okpsazkaxt", "jztzpxfvev", "onStart", "onStop", "uiLabel", "ikoacuggdj", "(Lwa2/draadjrbmk;)V", "Landroidx/media3/exoplayer/source/oxmwwwfdhm$iobyxmoadg;", "esjtqupxsv", "Landroidx/media3/exoplayer/source/oxmwwwfdhm$iobyxmoadg;", "ribwqtqdhb", "()Landroidx/media3/exoplayer/source/oxmwwwfdhm$iobyxmoadg;", "setMediaSourceFactory", "(Landroidx/media3/exoplayer/source/oxmwwwfdhm$iobyxmoadg;)V", "getMediaSourceFactory$annotations", "mediaSourceFactory", "Lq40/iobyxmoadg;", "lereixgezr", "Lq40/iobyxmoadg;", "vipkmwdibw", "()Lq40/iobyxmoadg;", "setSnackbarManager", "(Lq40/iobyxmoadg;)V", "snackbarManager", "Lru/myspar/videoplayer/api/model/VideoPlayerArgs;", "pmvmpeiblj", "Lgg/gtknphoqwx;", "sopmlzcsov", "()Lru/myspar/videoplayer/api/model/VideoPlayerArgs;", "args", "Landroidx/media3/exoplayer/ExoPlayer;", "zynmafqrjb", "Landroidx/media3/exoplayer/ExoPlayer;", "player", "", "istkbnxepw", "Z", "playWhenReady", "", "cdpycssgdh", "J", "playbackPosition", "ru/myspar/videoplayer/impl/presentation/VideoPlayerFragment$ppxfxbqfkf", "yadqdtsiqt", "Lru/myspar/videoplayer/impl/presentation/VideoPlayerFragment$ppxfxbqfkf;", "playerListener", "Lwa2/ppxfxbqfkf;", "iozdgvuglv", "crxdokpmqz", "()Lwa2/ppxfxbqfkf;", "binder", "Lwa2/agtfadlqog;", "lmojexxdyd", "Lzs/ppxfxbqfkf;", "jhduphickx", "()Lwa2/agtfadlqog;", "viewImpl", "Lua2/iobyxmoadg;", "wwaezpbzkn", "Lys/ppxfxbqfkf;", "jlmebxxoox", "()Lua2/iobyxmoadg;", "binding", "ylkuphrtab", "iobyxmoadg", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoPlayerFragment extends Hilt_VideoPlayerFragment<gtknphoqwx, btonecajqb, draadjrbmk> {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private long playbackPosition;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    public oxmwwwfdhm.iobyxmoadg mediaSourceFactory;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx binder;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private boolean playWhenReady;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name and from kotlin metadata */
    public q40.iobyxmoadg snackbarManager;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name and from kotlin metadata */
    private final zs.ppxfxbqfkf viewImpl;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gg.gtknphoqwx args;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name and from kotlin metadata */
    private final ys.ppxfxbqfkf binding;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name and from kotlin metadata */
    private final ppxfxbqfkf playerListener;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private ExoPlayer player;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    static final /* synthetic */ ah.gtknphoqwx[] f104669pkzmftpjix = {cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(VideoPlayerFragment.class, "viewImpl", "getViewImpl()Lru/myspar/videoplayer/impl/presentation/VideoPlayerViewImpl;", 0)), cllcsxoeiz.lqeggnwhkg(new yadqdtsiqt(VideoPlayerFragment.class, "binding", "getBinding()Lru/myspar/videoplayer/impl/databinding/FragmentVideoPlayerBinding;", 0))};

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    public static final int f104668hcddaimhww = 8;

    public static final class eablkybsjg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f104681zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public eablkybsjg(tg.iobyxmoadg iobyxmoadgVar) {
            super(0);
            this.f104681zdlpuopuiu = iobyxmoadgVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ribwqtqdhb invoke() {
            return (ribwqtqdhb) this.f104681zdlpuopuiu.invoke();
        }
    }

    public static final class gxszxtbevo extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f104682zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public gxszxtbevo(gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f104682zdlpuopuiu = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final jlmebxxoox invoke() {
            return stevsuqkhv.ppxfxbqfkf(this.f104682zdlpuopuiu).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: ru.myspar.videoplayer.impl.presentation.VideoPlayerFragment$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final VideoPlayerFragment iobyxmoadg(VideoPlayerArgs args) {
            zdlpuopuiu.btonecajqb(args, "args");
            return (VideoPlayerFragment) b40.iobyxmoadg.zoijcleaow(new VideoPlayerFragment(), args, false, 2, null);
        }

        private Companion() {
        }
    }

    public static final class lqeggnwhkg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f104683yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ tg.iobyxmoadg f104684zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lqeggnwhkg(tg.iobyxmoadg iobyxmoadgVar, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f104684zdlpuopuiu = iobyxmoadgVar;
            this.f104683yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final t2.iobyxmoadg invoke() {
            t2.iobyxmoadg iobyxmoadgVar;
            tg.iobyxmoadg iobyxmoadgVar2 = this.f104684zdlpuopuiu;
            if (iobyxmoadgVar2 != null && (iobyxmoadgVar = (t2.iobyxmoadg) iobyxmoadgVar2.invoke()) != null) {
                return iobyxmoadgVar;
            }
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f104683yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return dxjokdxxwwVar != null ? dxjokdxxwwVar.getDefaultViewModelCreationExtras() : t2.iobyxmoadg.zoijcleaow.f109316ppxfxbqfkf;
        }
    }

    public static final class nufgyqmvbu extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gg.gtknphoqwx f104685yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f104686zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public nufgyqmvbu(Fragment fragment, gg.gtknphoqwx gtknphoqwxVar) {
            super(0);
            this.f104686zdlpuopuiu = fragment;
            this.f104685yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final crxdokpmqz.ppxfxbqfkf invoke() {
            crxdokpmqz.ppxfxbqfkf defaultViewModelProviderFactory;
            ribwqtqdhb ribwqtqdhbVarPpxfxbqfkf = stevsuqkhv.ppxfxbqfkf(this.f104685yggfygwlhe);
            androidx.lifecycle.dxjokdxxww dxjokdxxwwVar = ribwqtqdhbVarPpxfxbqfkf instanceof androidx.lifecycle.dxjokdxxww ? (androidx.lifecycle.dxjokdxxww) ribwqtqdhbVarPpxfxbqfkf : null;
            return (dxjokdxxwwVar == null || (defaultViewModelProviderFactory = dxjokdxxwwVar.getDefaultViewModelProviderFactory()) == null) ? this.f104686zdlpuopuiu.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class ppxfxbqfkf implements esjtqupxsv.wkgbmnqykc {
        ppxfxbqfkf() {
        }

        @Override // v2.esjtqupxsv.wkgbmnqykc
        public void ntlheqmsrt(PlaybackException error) {
            zdlpuopuiu.btonecajqb(error, "error");
            r40.iobyxmoadg.ppxfxbqfkf(VideoPlayerFragment.this.vipkmwdibw(), ta2.ppxfxbqfkf.error_video, null, ss.wkgbmnqykc.gxszxtbevo.NonFatal, 2, null);
        }
    }

    public static final class wkgbmnqykc extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f104688zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public wkgbmnqykc(Fragment fragment) {
            super(0);
            this.f104688zdlpuopuiu = fragment;
        }

        @Override // tg.iobyxmoadg
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f104688zdlpuopuiu;
        }
    }

    /* synthetic */ class zoijcleaow extends vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f104689zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, ua2.iobyxmoadg.class, "bind", "bind(Landroid/view/View;)Lru/myspar/videoplayer/impl/databinding/FragmentVideoPlayerBinding;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ua2.iobyxmoadg invoke(View p13) {
            zdlpuopuiu.btonecajqb(p13, "p0");
            return ua2.iobyxmoadg.iobyxmoadg(p13);
        }
    }

    public VideoPlayerFragment() {
        super(ta2.zoijcleaow.fragment_video_player);
        this.args = gg.draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: wa2.eablkybsjg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return VideoPlayerFragment.ulzqkzuiru(this.f119198zdlpuopuiu);
            }
        });
        this.playWhenReady = true;
        this.playerListener = new ppxfxbqfkf();
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhn.NONE, new eablkybsjg(new wkgbmnqykc(this)));
        this.binder = stevsuqkhv.zoijcleaow(this, cllcsxoeiz.zoijcleaow(wa2.ppxfxbqfkf.class), new gxszxtbevo(gtknphoqwxVarIobyxmoadg), new lqeggnwhkg(null, gtknphoqwxVarIobyxmoadg), new nufgyqmvbu(this, gtknphoqwxVarIobyxmoadg));
        this.viewImpl = zs.wkgbmnqykc.iobyxmoadg(this, new tg.iobyxmoadg() { // from class: wa2.gxszxtbevo
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return VideoPlayerFragment.xrmfcynszj(this.f119200zdlpuopuiu);
            }
        });
        this.binding = ys.iobyxmoadg.zoijcleaow(this, zoijcleaow.f104689zdlpuopuiu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ua2.iobyxmoadg jlmebxxoox() {
        return (ua2.iobyxmoadg) this.binding.iobyxmoadg(this, f104669pkzmftpjix[1]);
    }

    private final void jztzpxfvev() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            this.playWhenReady = exoPlayer.nufgyqmvbu();
            this.playbackPosition = exoPlayer.ikoacuggdj();
            exoPlayer.pmvmpeiblj(this.playerListener);
            jlmebxxoox().f113102ppxfxbqfkf.setPlayer(null);
            exoPlayer.release();
        }
        this.player = null;
    }

    private final void okpsazkaxt() {
        ExoPlayer exoPlayerGxszxtbevo = new ExoPlayer.zoijcleaow(requireContext()).draadjrbmk(ribwqtqdhb()).gxszxtbevo();
        jlmebxxoox().f113102ppxfxbqfkf.setPlayer(exoPlayerGxszxtbevo);
        exoPlayerGxszxtbevo.agtfadlqog(kcexrzcfyt.zoijcleaow(sopmlzcsov().getVideoUrl()));
        exoPlayerGxszxtbevo.zynmafqrjb(this.playerListener);
        exoPlayerGxszxtbevo.dsvhmnatus(this.playbackPosition);
        exoPlayerGxszxtbevo.wflxmlrfwp(this.playWhenReady);
        exoPlayerGxszxtbevo.zoijcleaow();
        this.player = exoPlayerGxszxtbevo;
    }

    private final VideoPlayerArgs sopmlzcsov() {
        return (VideoPlayerArgs) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VideoPlayerArgs ulzqkzuiru(VideoPlayerFragment videoPlayerFragment) {
        return (VideoPlayerArgs) qs.ppxfxbqfkf.wkgbmnqykc(videoPlayerFragment, cllcsxoeiz.zoijcleaow(VideoPlayerArgs.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agtfadlqog xrmfcynszj(VideoPlayerFragment videoPlayerFragment) {
        return new agtfadlqog(new istkbnxepw(videoPlayerFragment) { // from class: ru.myspar.videoplayer.impl.presentation.VideoPlayerFragment.dxjokdxxww
            @Override // ah.draadjrbmk
            public Object get() {
                return ((VideoPlayerFragment) this.receiver).jlmebxxoox();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: crxdokpmqz, reason: merged with bridge method [inline-methods] */
    public wa2.ppxfxbqfkf pkzmftpjix() {
        return (wa2.ppxfxbqfkf) this.binder.getValue();
    }

    public void ikoacuggdj(draadjrbmk uiLabel) {
        zdlpuopuiu.btonecajqb(uiLabel, "uiLabel");
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    /* JADX INFO: renamed from: jhduphickx, reason: merged with bridge method [inline-methods] */
    public agtfadlqog hcddaimhww() {
        return (agtfadlqog) this.viewImpl.iobyxmoadg(this, f104669pkzmftpjix[0]);
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment
    public /* bridge */ /* synthetic */ void jpowsppfya(Object obj) {
        yggfygwlhe.iobyxmoadg(obj);
        ikoacuggdj(null);
    }

    @Override // ru.myspar.core.base.mvi.fragment.BaseMviFragment, ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        okpsazkaxt();
    }

    @Override // ru.myspar.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        jztzpxfvev();
    }

    public final oxmwwwfdhm.iobyxmoadg ribwqtqdhb() {
        oxmwwwfdhm.iobyxmoadg iobyxmoadgVar = this.mediaSourceFactory;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("mediaSourceFactory");
        return null;
    }

    public final q40.iobyxmoadg vipkmwdibw() {
        q40.iobyxmoadg iobyxmoadgVar = this.snackbarManager;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        zdlpuopuiu.pmvmpeiblj("snackbarManager");
        return null;
    }
}
