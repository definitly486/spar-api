package kw1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg extends Throwable {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C1221iobyxmoadg f60788yggfygwlhe = new C1221iobyxmoadg(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f60789zdlpuopuiu;

    /* JADX INFO: renamed from: kw1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1221iobyxmoadg {
        public /* synthetic */ C1221iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final Throwable iobyxmoadg(ErrorResponse response) {
            zdlpuopuiu.btonecajqb(response, "response");
            String code = response.getCode();
            String message = response.getMessage();
            return (!zdlpuopuiu.eablkybsjg(code, "activeOrdersExist") || message == null) ? new DomainException(message, code) : new iobyxmoadg(message);
        }

        private C1221iobyxmoadg() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(String message) {
        super(message);
        zdlpuopuiu.btonecajqb(message, "message");
        this.f60789zdlpuopuiu = message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f60789zdlpuopuiu;
    }
}
