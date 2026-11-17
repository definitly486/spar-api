package pb2;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes6.dex */
final class ojitshcjhn extends pb2.iobyxmoadg {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ob2.iobyxmoadg f76340ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pb2.iobyxmoadg f76341zoijcleaow;

    static final class iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ btonecajqb f76342yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(btonecajqb btonecajqbVar) {
            super(0);
            this.f76342yggfygwlhe = btonecajqbVar;
        }

        @Override // tg.iobyxmoadg
        public /* bridge */ /* synthetic */ Object invoke() {
            iobyxmoadg();
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg() {
            ojitshcjhn.this.f76341zoijcleaow.iobyxmoadg(this.f76342yggfygwlhe);
        }
    }

    public ojitshcjhn(pb2.iobyxmoadg upstream, ob2.iobyxmoadg dispatcher) {
        zdlpuopuiu.btonecajqb(upstream, "upstream");
        zdlpuopuiu.btonecajqb(dispatcher, "dispatcher");
        this.f76341zoijcleaow = upstream;
        this.f76340ppxfxbqfkf = dispatcher;
    }

    @Override // pb2.iobyxmoadg
    public void iobyxmoadg(btonecajqb downstream) {
        zdlpuopuiu.btonecajqb(downstream, "downstream");
        this.f76340ppxfxbqfkf.iobyxmoadg(new iobyxmoadg(downstream));
    }
}
