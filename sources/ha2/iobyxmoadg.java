package ha2;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.core.network.model.ErrorResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends Throwable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C0925iobyxmoadg f39960yggfygwlhe = new C0925iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f39961zdlpuopuiu;

    /* JADX INFO: renamed from: ha2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0925iobyxmoadg {
        public /* synthetic */ C0925iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final Throwable iobyxmoadg(ErrorResponse response) {
            zdlpuopuiu.btonecajqb(response, "response");
            String code = response.getCode();
            String message = response.getMessage();
            return (!zdlpuopuiu.eablkybsjg(code, "activeOrdersExist") || message == null) ? new DomainException(message, code) : new iobyxmoadg(message);
        }

        private C0925iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(String message) {
        super(message);
        zdlpuopuiu.btonecajqb(message, "message");
        this.f39961zdlpuopuiu = message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f39961zdlpuopuiu;
    }
}
