package z12;

import a22.ScanGoStartDto;
import b22.ScanGoCartDto;
import b22.ScanGoCartReferencesDto;
import c22.ScanGoProductDto;
import g22.wkgbmnqykc;
import gz.ReferenceDto;
import hg.jyumaefscl;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k30.nufgyqmvbu;
import kotlin.jvm.internal.zdlpuopuiu;
import mk.rgvfuqvkyq;
import oy.draadjrbmk;
import ru.myspar.core.network.model.BasicResponse;
import ru.myspar.core.network.model.ErrorResponse;
import ru.myspar.core.network.model.WarningDto;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartModel;
import ru.myspar.scango.impl.component.domain.model.cart.ScanGoCartReferences;
import ru.myspar.scango.impl.component.domain.model.product.ScanGoProductModel;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final nufgyqmvbu f127597iobyxmoadg;

    public iobyxmoadg(nufgyqmvbu measureTypeUtils) {
        zdlpuopuiu.btonecajqb(measureTypeUtils, "measureTypeUtils");
        this.f127597iobyxmoadg = measureTypeUtils;
    }

    private final ScanGoCartModel eablkybsjg(ScanGoCartDto scanGoCartDto) {
        Object next;
        List listIobyxmoadg = iobyxmoadg(scanGoCartDto.getBasket());
        Iterator it = listIobyxmoadg.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!zdlpuopuiu.eablkybsjg(((ScanGoProductModel) next).getArticle(), scanGoCartDto.getAddedProductArticle()));
        ScanGoProductModel scanGoProductModel = (ScanGoProductModel) next;
        ScanGoCartReferencesDto refs = scanGoCartDto.getRefs();
        ScanGoCartReferences scanGoCartReferencesGxszxtbevo = refs != null ? gxszxtbevo(refs) : null;
        LocalDateTime localDateTime = LocalDateTime.parse(scanGoCartDto.getScangoEnd(), zoijcleaow.f127598iobyxmoadg);
        zdlpuopuiu.dxjokdxxww(localDateTime, "parse(...)");
        return new ScanGoCartModel(localDateTime, scanGoCartDto.getScangoLeft(), scanGoCartDto.getShopId(), listIobyxmoadg, scanGoCartDto.getSum().getBasket(), scanGoCartDto.getSum().getCnt(), scanGoProductModel, scanGoCartDto.getIsWalletPayNeedVerify(), scanGoCartReferencesGxszxtbevo);
    }

    private final ScanGoCartReferences gxszxtbevo(ScanGoCartReferencesDto scanGoCartReferencesDto) {
        List payment = scanGoCartReferencesDto.getPayment();
        if (payment == null) {
            payment = jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(payment, 10));
        Iterator it = payment.iterator();
        while (it.hasNext()) {
            arrayList.add(draadjrbmk.iobyxmoadg((ReferenceDto) it.next()));
        }
        return new ScanGoCartReferences(arrayList);
    }

    private final List iobyxmoadg(List list) {
        if (list == null || list.isEmpty()) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg((ScanGoProductDto) it.next()));
        }
        return rgvfuqvkyq.yggfygwlhe(arrayList);
    }

    private final ScanGoProductModel lqeggnwhkg(ScanGoProductDto scanGoProductDto) {
        String article = scanGoProductDto.getArticle();
        int id2 = scanGoProductDto.getId();
        x30.iobyxmoadg iobyxmoadgVarDraadjrbmk = this.f127597iobyxmoadg.draadjrbmk(scanGoProductDto.getMeasure());
        String name = scanGoProductDto.getName();
        String pic = scanGoProductDto.getPic();
        double price = scanGoProductDto.getPrice();
        double quantity = scanGoProductDto.getQuantity();
        List markCodes = scanGoProductDto.getMarkCodes();
        if (markCodes == null) {
            markCodes = jyumaefscl.wflxmlrfwp();
        }
        return new ScanGoProductModel(article, id2, iobyxmoadgVarDraadjrbmk, name, pic, price, quantity, markCodes);
    }

    private final List wkgbmnqykc(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                WarningDto warningDto = (WarningDto) it.next();
                String message = warningDto.getMessage();
                if (message == null) {
                    message = "";
                }
                arrayList.add(new wkgbmnqykc(message, f22.zoijcleaow.f32654yggfygwlhe.iobyxmoadg(warningDto.getCode())));
            }
            List listM = jyumaefscl.m(arrayList);
            if (listM != null) {
                return listM;
            }
        }
        return jyumaefscl.wflxmlrfwp();
    }

    public final o32.zoijcleaow ppxfxbqfkf(BasicResponse response) {
        zdlpuopuiu.btonecajqb(response, "response");
        ScanGoStartDto scanGoStartDto = (ScanGoStartDto) response.getData();
        if (zdlpuopuiu.eablkybsjg(response.getResult(), Boolean.TRUE) && scanGoStartDto != null) {
            return new o32.zoijcleaow(LocalDateTime.parse(scanGoStartDto.getSessionExpiresAt(), zoijcleaow.f127598iobyxmoadg), scanGoStartDto.getStartText(), false, null, null, 28, null);
        }
        f22.zoijcleaow.iobyxmoadg iobyxmoadgVar = f22.zoijcleaow.f32654yggfygwlhe;
        ErrorResponse error = response.getError();
        f22.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(error != null ? error.getCode() : null);
        ErrorResponse error2 = response.getError();
        return new o32.zoijcleaow(null, null, false, zoijcleaowVarIobyxmoadg, error2 != null ? error2.getMessage() : null, 7, null);
    }

    public final g22.iobyxmoadg zoijcleaow(BasicResponse response) {
        zdlpuopuiu.btonecajqb(response, "response");
        ScanGoCartDto scanGoCartDto = (ScanGoCartDto) response.getData();
        if (zdlpuopuiu.eablkybsjg(response.getResult(), Boolean.TRUE) && scanGoCartDto != null) {
            return new g22.iobyxmoadg(eablkybsjg(scanGoCartDto), false, null, null, wkgbmnqykc(response.getWarnings()), 14, null);
        }
        f22.zoijcleaow.iobyxmoadg iobyxmoadgVar = f22.zoijcleaow.f32654yggfygwlhe;
        ErrorResponse error = response.getError();
        f22.zoijcleaow zoijcleaowVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg(error != null ? error.getCode() : null);
        ErrorResponse error2 = response.getError();
        return new g22.iobyxmoadg(null, false, zoijcleaowVarIobyxmoadg, error2 != null ? error2.getMessage() : null, wkgbmnqykc(response.getWarnings()), 3, null);
    }
}
