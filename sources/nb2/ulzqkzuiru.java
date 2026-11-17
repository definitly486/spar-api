package nb2;

import java.net.URI;

/* JADX INFO: loaded from: classes6.dex */
public final class ulzqkzuiru extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ ribwqtqdhb f69618zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ulzqkzuiru(ribwqtqdhb ribwqtqdhbVar) {
        super(0);
        this.f69618zdlpuopuiu = ribwqtqdhbVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        this.f69618zdlpuopuiu.f69608iobyxmoadg.getClass();
        return new URI("https://stats.rustore.ru").resolve("/v1/send_custom_event_batch").toURL();
    }
}
