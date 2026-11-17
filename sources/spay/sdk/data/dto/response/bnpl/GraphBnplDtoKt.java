package spay.sdk.data.dto.response.bnpl;

import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import spay.sdk.domain.model.response.bnpl.BnplPayment;
import spay.sdk.domain.model.response.bnpl.GraphBnpl;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006*\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000\u001a\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¨\u0006\b"}, d2 = {"toDto", "Lspay/sdk/data/dto/response/bnpl/BnplPaymentDto;", "Lspay/sdk/domain/model/response/bnpl/BnplPayment;", "Lspay/sdk/data/dto/response/bnpl/GraphBnplDto;", "Lspay/sdk/domain/model/response/bnpl/GraphBnpl;", "toDtoList", "", "toModelList", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class GraphBnplDtoKt {
    public static final GraphBnplDto toDto(GraphBnpl graphBnpl) {
        zdlpuopuiu.btonecajqb(graphBnpl, "<this>");
        String header = graphBnpl.getHeader();
        String content = graphBnpl.getContent();
        String count = graphBnpl.getCount();
        String text = graphBnpl.getText();
        List<BnplPayment> payments = graphBnpl.getPayments();
        return new GraphBnplDto(header, content, count, text, payments != null ? toDtoList(payments) : null);
    }

    public static final List<BnplPaymentDto> toDtoList(List<BnplPayment> list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((BnplPayment) it.next()));
        }
        return arrayList;
    }

    public static final List<BnplPayment> toModelList(List<BnplPaymentDto> list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((BnplPaymentDto) it.next()).toModel());
        }
        return arrayList;
    }

    public static final BnplPaymentDto toDto(BnplPayment bnplPayment) {
        zdlpuopuiu.btonecajqb(bnplPayment, "<this>");
        return new BnplPaymentDto(bnplPayment.getDate(), Long.valueOf(bnplPayment.getAmount()), bnplPayment.getCurrencyCode());
    }
}
