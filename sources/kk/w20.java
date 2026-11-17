package kk;

import spay.sdk.domain.model.response.listOfCards.ListOfCardsResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class w20 extends hl {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ListOfCardsResponseBody f59085iobyxmoadg;

    public w20(ListOfCardsResponseBody listOfCardsResponseBody) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(listOfCardsResponseBody, "listOfCardsResponseBody");
        this.f59085iobyxmoadg = listOfCardsResponseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w20) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f59085iobyxmoadg, ((w20) obj).f59085iobyxmoadg);
    }

    public final int hashCode() {
        return this.f59085iobyxmoadg.hashCode();
    }

    public final String toString() {
        return "ListOfCardsResult(listOfCardsResponseBody=" + this.f59085iobyxmoadg + ")";
    }
}
