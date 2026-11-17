package o40;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import ru.myspar.core.error_handler.exceptions.DomainException;
import ru.myspar.core.models.Warning;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;
import ru.myspar.core.network.model.WarningDto;
import tg.draadjrbmk;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eablkybsjg {
    public static /* synthetic */ Object agtfadlqog(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        return wflxmlrfwp(basicResponse, draadjrbmkVar);
    }

    public static /* synthetic */ void btonecajqb(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, int i13, Object obj) throws Throwable {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        dxjokdxxww(basicResponse, draadjrbmkVar);
    }

    public static /* synthetic */ Warning draadjrbmk(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        if ((i13 & 2) != 0) {
            draadjrbmkVar2 = null;
        }
        return gtknphoqwx(basicResponse, draadjrbmkVar, draadjrbmkVar2);
    }

    public static final void dxjokdxxww(BasicResponse basicResponse, draadjrbmk draadjrbmkVar) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        if (!zdlpuopuiu.eablkybsjg(basicResponse.getResult(), Boolean.TRUE)) {
            throw zoijcleaow(basicResponse.getError(), draadjrbmkVar);
        }
    }

    public static /* synthetic */ Warning eablkybsjg(List list, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        return ppxfxbqfkf(list, draadjrbmkVar);
    }

    public static final Warning gtknphoqwx(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        if (zdlpuopuiu.eablkybsjg(basicResponse.getResult(), Boolean.TRUE)) {
            return ppxfxbqfkf(basicResponse.getWarnings(), draadjrbmkVar2);
        }
        throw zoijcleaow(basicResponse.getError(), draadjrbmkVar);
    }

    private static final List gxszxtbevo(List list) {
        Warning withCodeAndMessage;
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
            if (zdlpuopuiu.eablkybsjg(str, n40.iobyxmoadg.nufgyqmvbu.f68778zoijcleaow.iobyxmoadg()) && !kcexrzcfyt.zfvoamnweg(message)) {
                withCodeAndMessage = new Warning.DailyLimit(message, str);
            } else if (zdlpuopuiu.eablkybsjg(str, n40.iobyxmoadg.wkgbmnqykc.f68780zoijcleaow.iobyxmoadg())) {
                withCodeAndMessage = new Warning.Interval(message, str);
            } else if (zdlpuopuiu.eablkybsjg(str, n40.iobyxmoadg.C1479iobyxmoadg.f68774zoijcleaow.iobyxmoadg())) {
                withCodeAndMessage = new Warning.AvailableOnlyForPickup(message, str);
            } else {
                withCodeAndMessage = (kcexrzcfyt.zfvoamnweg(message) || kcexrzcfyt.zfvoamnweg(str)) ? null : new Warning.WithCodeAndMessage(message, str);
            }
            if (withCodeAndMessage != null) {
                arrayList.add(withCodeAndMessage);
            }
        }
        return jyumaefscl.m(arrayList);
    }

    private static final boolean iobyxmoadg(BasicResponse basicResponse) {
        return zdlpuopuiu.eablkybsjg(basicResponse.getResult(), Boolean.TRUE) && basicResponse.getData() != null;
    }

    public static final Object lqeggnwhkg(BasicResponse basicResponse, draadjrbmk draadjrbmkVar) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        if (zdlpuopuiu.eablkybsjg(basicResponse.getResult(), Boolean.TRUE)) {
            return basicResponse.getData();
        }
        throw zoijcleaow(basicResponse.getError(), draadjrbmkVar);
    }

    public static /* synthetic */ Object nufgyqmvbu(BasicResponse basicResponse, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        return lqeggnwhkg(basicResponse, draadjrbmkVar);
    }

    public static final Object ojitshcjhn(BasicResponse basicResponse, rgvfuqvkyq mapper, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        if (!iobyxmoadg(basicResponse)) {
            throw zoijcleaow(basicResponse.getError(), draadjrbmkVar);
        }
        Object data = basicResponse.getData();
        if (data != null) {
            return mapper.invoke(data, ppxfxbqfkf(basicResponse.getWarnings(), draadjrbmkVar2));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object oxmwwwfdhm(BasicResponse basicResponse, rgvfuqvkyq mapper, draadjrbmk draadjrbmkVar, draadjrbmk draadjrbmkVar2) {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        if (!iobyxmoadg(basicResponse)) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            return gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(zoijcleaow(basicResponse.getError(), draadjrbmkVar)));
        }
        Object data = basicResponse.getData();
        if (data != null) {
            return gg.kcexrzcfyt.wkgbmnqykc(mapper.invoke(data, ppxfxbqfkf(basicResponse.getWarnings(), draadjrbmkVar2)));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Warning ppxfxbqfkf(List list, draadjrbmk draadjrbmkVar) {
        WarningDto warningDto;
        if (list == null) {
            return Warning.Empty.f87479jyumaefscl;
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
        if (zdlpuopuiu.eablkybsjg(str, n40.iobyxmoadg.nufgyqmvbu.f68778zoijcleaow.iobyxmoadg()) && !kcexrzcfyt.zfvoamnweg(message)) {
            return new Warning.DailyLimit(message, str);
        }
        if (zdlpuopuiu.eablkybsjg(str, n40.iobyxmoadg.wkgbmnqykc.f68780zoijcleaow.iobyxmoadg())) {
            return new Warning.Interval(message, str);
        }
        if (zdlpuopuiu.eablkybsjg(str, n40.iobyxmoadg.C1479iobyxmoadg.f68774zoijcleaow.iobyxmoadg())) {
            return new Warning.AvailableOnlyForPickup(message, str);
        }
        return (kcexrzcfyt.zfvoamnweg(message) || kcexrzcfyt.zfvoamnweg(str)) ? Warning.Empty.f87479jyumaefscl : new Warning.WithCodeAndMessage(message, str);
    }

    public static final void rgvfuqvkyq(BasicResponse basicResponse) throws Throwable {
        List<WarningDto> warnings;
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        Boolean result = basicResponse.getResult();
        Boolean bool = Boolean.TRUE;
        if (zdlpuopuiu.eablkybsjg(result, bool) && ((warnings = basicResponse.getWarnings()) == null || warnings.isEmpty())) {
            return;
        }
        if (!zdlpuopuiu.eablkybsjg(basicResponse.getResult(), bool)) {
            throw wkgbmnqykc(basicResponse.getError(), null, 1, null);
        }
        throw new DomainException(eablkybsjg(basicResponse.getWarnings(), null, 1, null).getMessage(), null, 2, null);
    }

    public static final Object vdvldrhtss(BasicResponse basicResponse, rgvfuqvkyq mapper, draadjrbmk draadjrbmkVar) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        zdlpuopuiu.btonecajqb(mapper, "mapper");
        if (!iobyxmoadg(basicResponse)) {
            throw zoijcleaow(basicResponse.getError(), draadjrbmkVar);
        }
        Object data = basicResponse.getData();
        if (data != null) {
            return mapper.invoke(data, gxszxtbevo(basicResponse.getWarnings()));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object wflxmlrfwp(BasicResponse basicResponse, draadjrbmk draadjrbmkVar) throws Throwable {
        zdlpuopuiu.btonecajqb(basicResponse, "<this>");
        if (!iobyxmoadg(basicResponse)) {
            throw zoijcleaow(basicResponse.getError(), draadjrbmkVar);
        }
        Object data = basicResponse.getData();
        if (data != null) {
            return data;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static /* synthetic */ Throwable wkgbmnqykc(ErrorResponse errorResponse, draadjrbmk draadjrbmkVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            draadjrbmkVar = null;
        }
        return zoijcleaow(errorResponse, draadjrbmkVar);
    }

    public static final Throwable zoijcleaow(ErrorResponse errorResponse, draadjrbmk draadjrbmkVar) {
        Throwable domainException = (errorResponse == null || draadjrbmkVar == null) ? null : (Throwable) draadjrbmkVar.invoke(errorResponse);
        if (domainException == null) {
            domainException = new DomainException(errorResponse != null ? errorResponse.getMessage() : null, errorResponse != null ? errorResponse.getCode() : null);
        }
        return domainException;
    }
}
