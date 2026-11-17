package x21;

import android.os.Parcelable;
import gg.kcexrzcfyt;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainException;
import ru.myspar.proloyalty.core.error_handler.exceptions.DomainWithButtonException;
import ru.myspar.proloyalty.core.models.Warning;
import ru.myspar.proloyalty.core.network.model.BasicResponse;
import ru.myspar.proloyalty.core.network.model.ErrorResponse;
import ru.myspar.proloyalty.core.network.model.WarningDto;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wkgbmnqykc {
    public static /* synthetic */ void agtfadlqog(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, int i13, Object obj) throws Throwable {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        wflxmlrfwp(basicResponse, draadjrbmkVar);
    }

    private static final Exception btonecajqb(ErrorResponse errorResponse) {
        ErrorResponse.Button button = errorResponse.getButton();
        if (button == null) {
            return null;
        }
        String message = errorResponse.getMessage();
        if (message == null) {
            message = "";
        }
        String code = errorResponse.getCode();
        return new DomainWithButtonException(message, code != null ? code : "", nufgyqmvbu(button));
    }

    public static /* synthetic */ Object draadjrbmk(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        return gtknphoqwx(basicResponse, draadjrbmkVar);
    }

    private static final DomainException dxjokdxxww(ErrorResponse errorResponse) {
        return new DomainException(errorResponse != null ? errorResponse.getMessage() : null, errorResponse != null ? errorResponse.getCode() : null);
    }

    public static /* synthetic */ Throwable eablkybsjg(ErrorResponse errorResponse, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        return ppxfxbqfkf(errorResponse, draadjrbmkVar);
    }

    public static final Object gtknphoqwx(BasicResponse basicResponse, draadjrbmk draadjrbmkVar) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        if (zdlpuopuiu.eablkybsjg(basicResponse.getResult(), Boolean.TRUE)) {
            return basicResponse.getData();
        }
        throw ppxfxbqfkf(basicResponse.getError(), draadjrbmkVar);
    }

    public static /* synthetic */ Warning gxszxtbevo(List list, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        return wkgbmnqykc(list, draadjrbmkVar);
    }

    private static final Exception iobyxmoadg(ErrorResponse errorResponse) {
        Exception excBtonecajqb;
        return (errorResponse == null || (excBtonecajqb = btonecajqb(errorResponse)) == null) ? dxjokdxxww(errorResponse) : excBtonecajqb;
    }

    public static final Object jyumaefscl(BasicResponse basicResponse, rgvfuqvkyq mapper, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        if (!zoijcleaow(basicResponse)) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar = kcexrzcfyt.f37117yggfygwlhe;
            return kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(ppxfxbqfkf(basicResponse.getError(), draadjrbmkVar)));
        }
        Object data = basicResponse.getData();
        if (data != null) {
            return kcexrzcfyt.wkgbmnqykc(mapper.invoke(data, wkgbmnqykc(basicResponse.getWarnings(), draadjrbmkVar2)));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object kcexrzcfyt(BasicResponse basicResponse, rgvfuqvkyq mapper, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        if (!zoijcleaow(basicResponse)) {
            throw ppxfxbqfkf(basicResponse.getError(), draadjrbmkVar);
        }
        Object data = basicResponse.getData();
        if (data != null) {
            return mapper.invoke(data, wkgbmnqykc(basicResponse.getWarnings(), draadjrbmkVar2));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private static final List lqeggnwhkg(List list) {
        Parcelable withCodeAndMessage;
        if (list == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WarningDto warningDto = (WarningDto) it.next();
            String message = warningDto.getMessage();
            if (message == null) {
                message = "";
            }
            String code = warningDto.getCode();
            String str = code != null ? code : "";
            if (zdlpuopuiu.eablkybsjg(str, w21.iobyxmoadg.dxjokdxxww.f118592zoijcleaow.iobyxmoadg()) && !mj.kcexrzcfyt.zfvoamnweg(message)) {
                withCodeAndMessage = new Warning.DailyLimit(message, str);
            } else if (zdlpuopuiu.eablkybsjg(str, w21.iobyxmoadg.wkgbmnqykc.f118606zoijcleaow.iobyxmoadg())) {
                withCodeAndMessage = new Warning.Interval(message, str);
            } else if (zdlpuopuiu.eablkybsjg(str, w21.iobyxmoadg.C2949iobyxmoadg.f118600zoijcleaow.iobyxmoadg()) || zdlpuopuiu.eablkybsjg(str, w21.iobyxmoadg.gxszxtbevo.f118598zoijcleaow.iobyxmoadg())) {
                withCodeAndMessage = new Warning.AvailableOnlyForPickup(message, str);
            } else {
                withCodeAndMessage = (mj.kcexrzcfyt.zfvoamnweg(message) || mj.kcexrzcfyt.zfvoamnweg(str)) ? null : new Warning.WithCodeAndMessage(message, str);
            }
            if (withCodeAndMessage != null) {
                arrayList.add(withCodeAndMessage);
            }
        }
        return jyumaefscl.m(arrayList);
    }

    private static final DomainWithButtonException.iobyxmoadg nufgyqmvbu(ErrorResponse.Button button) {
        String text = button.getText();
        if (text == null) {
            text = "";
        }
        Integer duration = button.getDuration();
        int iIntValue = duration != null ? duration.intValue() : 0;
        String navLink = button.getNavLink();
        return new DomainWithButtonException.iobyxmoadg(text, iIntValue, navLink != null ? navLink : "", button.getReference());
    }

    public static final Warning ojitshcjhn(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        if (zdlpuopuiu.eablkybsjg(basicResponse.getResult(), Boolean.TRUE)) {
            return wkgbmnqykc(basicResponse.getWarnings(), draadjrbmkVar2);
        }
        throw ppxfxbqfkf(basicResponse.getError(), draadjrbmkVar);
    }

    public static /* synthetic */ Object oxmwwwfdhm(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        return vdvldrhtss(basicResponse, draadjrbmkVar);
    }

    public static final Throwable ppxfxbqfkf(ErrorResponse errorResponse, draadjrbmk draadjrbmkVar) {
        Throwable th2 = null;
        if (errorResponse != null && draadjrbmkVar != null) {
            th2 = (Throwable) draadjrbmkVar.invoke(errorResponse);
        }
        if (th2 == null) {
            return iobyxmoadg(errorResponse);
        }
        if (!(th2 instanceof DomainException)) {
            return th2;
        }
        Exception excBtonecajqb = btonecajqb(errorResponse);
        return excBtonecajqb == null ? (Exception) th2 : excBtonecajqb;
    }

    public static /* synthetic */ Warning rgvfuqvkyq(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        if ((i13 & 2) != 0) {
            draadjrbmkVar2 = null;
        }
        return ojitshcjhn(basicResponse, draadjrbmkVar, draadjrbmkVar2);
    }

    public static final Object vdvldrhtss(BasicResponse basicResponse, draadjrbmk draadjrbmkVar) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        if (!zoijcleaow(basicResponse)) {
            throw ppxfxbqfkf(basicResponse.getError(), draadjrbmkVar);
        }
        Object data = basicResponse.getData();
        if (data != null) {
            return data;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void wflxmlrfwp(BasicResponse basicResponse, draadjrbmk draadjrbmkVar) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        if (!zdlpuopuiu.eablkybsjg(basicResponse.getResult(), Boolean.TRUE)) {
            throw ppxfxbqfkf(basicResponse.getError(), draadjrbmkVar);
        }
    }

    public static final Warning wkgbmnqykc(List list, draadjrbmk draadjrbmkVar) {
        WarningDto warningDto;
        if (list == null) {
            return Warning.Empty.f95255jyumaefscl;
        }
        if (draadjrbmkVar == null || (warningDto = (WarningDto) draadjrbmkVar.invoke(list)) == null) {
            warningDto = (WarningDto) jyumaefscl.weqkydbzbr(list);
        }
        String message = warningDto != null ? warningDto.getMessage() : null;
        if (message == null) {
            message = "";
        }
        String code = warningDto != null ? warningDto.getCode() : null;
        String str = code != null ? code : "";
        if (zdlpuopuiu.eablkybsjg(str, w21.iobyxmoadg.dxjokdxxww.f118592zoijcleaow.iobyxmoadg()) && !mj.kcexrzcfyt.zfvoamnweg(message)) {
            return new Warning.DailyLimit(message, str);
        }
        if (zdlpuopuiu.eablkybsjg(str, w21.iobyxmoadg.wkgbmnqykc.f118606zoijcleaow.iobyxmoadg())) {
            return new Warning.Interval(message, str);
        }
        if (!zdlpuopuiu.eablkybsjg(str, w21.iobyxmoadg.C2949iobyxmoadg.f118600zoijcleaow.iobyxmoadg()) && !zdlpuopuiu.eablkybsjg(str, w21.iobyxmoadg.gxszxtbevo.f118598zoijcleaow.iobyxmoadg())) {
            return (mj.kcexrzcfyt.zfvoamnweg(message) || mj.kcexrzcfyt.zfvoamnweg(str)) ? Warning.Empty.f95255jyumaefscl : new Warning.WithCodeAndMessage(message, str);
        }
        return new Warning.AvailableOnlyForPickup(message, str);
    }

    public static final Object yggfygwlhe(BasicResponse basicResponse, rgvfuqvkyq mapper, draadjrbmk draadjrbmkVar) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        if (!zoijcleaow(basicResponse)) {
            throw ppxfxbqfkf(basicResponse.getError(), draadjrbmkVar);
        }
        Object data = basicResponse.getData();
        if (data != null) {
            return mapper.invoke(data, lqeggnwhkg(basicResponse.getWarnings()));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object zdlpuopuiu(BasicResponse basicResponse) throws Throwable {
        List<WarningDto> warnings;
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        Boolean result = basicResponse.getResult();
        Boolean bool = Boolean.TRUE;
        if (zdlpuopuiu.eablkybsjg(result, bool) && ((warnings = basicResponse.getWarnings()) == null || warnings.isEmpty())) {
            return basicResponse.getData();
        }
        if (zdlpuopuiu.eablkybsjg(basicResponse.getResult(), bool)) {
            throw new DomainException(gxszxtbevo(basicResponse.getWarnings(), null, 1, null).getMessage(), null, 2, null);
        }
        throw eablkybsjg(basicResponse.getError(), null, 1, null);
    }

    private static final boolean zoijcleaow(BasicResponse basicResponse) {
        return zdlpuopuiu.eablkybsjg(basicResponse.getResult(), Boolean.TRUE) && basicResponse.getData() != null;
    }
}
