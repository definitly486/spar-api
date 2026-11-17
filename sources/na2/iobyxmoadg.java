package na2;

import dt.zoijcleaow;
import java.time.Duration;
import java.time.LocalDateTime;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ma2.UserDynamicQrCodeDto;
import ru.myspar.user.models.UserDynamicQrCode;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final C1493iobyxmoadg f69422zoijcleaow = new C1493iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f69423iobyxmoadg;

    /* JADX INFO: renamed from: na2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1493iobyxmoadg {
        public /* synthetic */ C1493iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1493iobyxmoadg() {
        }
    }

    public iobyxmoadg(zoijcleaow dateUtils) {
        zdlpuopuiu.btonecajqb(dateUtils, "dateUtils");
        this.f69423iobyxmoadg = dateUtils;
    }

    public final UserDynamicQrCode iobyxmoadg(UserDynamicQrCodeDto dto) {
        zdlpuopuiu.btonecajqb(dto, "dto");
        LocalDateTime localDateTimeGxszxtbevo = this.f69423iobyxmoadg.gxszxtbevo(dto.getDateEnd());
        long millis = Duration.between(this.f69423iobyxmoadg.nufgyqmvbu(), this.f69423iobyxmoadg.gxszxtbevo(dto.getServerTime())).toMillis() / ((long) 1000);
        String qrcode = dto.getQrcode();
        LocalDateTime localDateTimeMinusSeconds = localDateTimeGxszxtbevo.minusSeconds(millis);
        zdlpuopuiu.dxjokdxxww(localDateTimeMinusSeconds, "minusSeconds(...)");
        String desc = dto.getDesc();
        if (desc == null) {
            desc = "";
        }
        return new UserDynamicQrCode(qrcode, localDateTimeMinusSeconds, desc);
    }
}
