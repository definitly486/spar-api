package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifierStatus f45408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f45409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45410c;

    public c(IdentifierStatus identifierStatus, a aVar, String str) {
        this.f45408a = identifierStatus;
        this.f45409b = aVar;
        this.f45410c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f45408a == cVar.f45408a && zdlpuopuiu.eablkybsjg(this.f45409b, cVar.f45409b) && zdlpuopuiu.eablkybsjg(this.f45410c, cVar.f45410c);
    }

    public final int hashCode() {
        int iHashCode = this.f45408a.hashCode() * 31;
        a aVar = this.f45409b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f45410c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f45408a + ", advIdInfo=" + this.f45409b + ", errorExplanation=" + this.f45410c + ')';
    }

    public /* synthetic */ c(IdentifierStatus identifierStatus, a aVar, String str, int i13) {
        this(identifierStatus, (i13 & 2) != 0 ? null : aVar, (i13 & 4) != 0 ? null : str);
    }
}
