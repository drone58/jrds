/*
 * Automatically generated by jrpcgen 1.0.6 on 14/01/06 17:53
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 */
package jrds.probe.rstat;
import org.acplt.oncrpc.*;
import java.io.IOException;

public class statstime implements XdrAble {
    public int [] cp_time;
    public int [] dk_xfer;
    public int v_pgpgin;
    public int v_pgpgout;
    public int v_pswpin;
    public int v_pswpout;
    public int v_intr;
    public int if_ipackets;
    public int if_ierrors;
    public int if_oerrors;
    public int if_collisions;
    public int v_swtch;
    public int [] avenrun;
    public rstat_timeval boottime;
    public rstat_timeval curtime;
    public int if_opackets;

    public statstime() {
    }

    public statstime(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeIntFixedVector(cp_time, rstat.RSTAT_CPUSTATES);
        xdr.xdrEncodeIntFixedVector(dk_xfer, rstat.RSTAT_DK_NDRIVE);
        xdr.xdrEncodeInt(v_pgpgin);
        xdr.xdrEncodeInt(v_pgpgout);
        xdr.xdrEncodeInt(v_pswpin);
        xdr.xdrEncodeInt(v_pswpout);
        xdr.xdrEncodeInt(v_intr);
        xdr.xdrEncodeInt(if_ipackets);
        xdr.xdrEncodeInt(if_ierrors);
        xdr.xdrEncodeInt(if_oerrors);
        xdr.xdrEncodeInt(if_collisions);
        xdr.xdrEncodeInt(v_swtch);
        xdr.xdrEncodeIntFixedVector(avenrun, 3);
        boottime.xdrEncode(xdr);
        curtime.xdrEncode(xdr);
        xdr.xdrEncodeInt(if_opackets);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        cp_time = xdr.xdrDecodeIntFixedVector(rstat.RSTAT_CPUSTATES);
        dk_xfer = xdr.xdrDecodeIntFixedVector(rstat.RSTAT_DK_NDRIVE);
        v_pgpgin = xdr.xdrDecodeInt();
        v_pgpgout = xdr.xdrDecodeInt();
        v_pswpin = xdr.xdrDecodeInt();
        v_pswpout = xdr.xdrDecodeInt();
        v_intr = xdr.xdrDecodeInt();
        if_ipackets = xdr.xdrDecodeInt();
        if_ierrors = xdr.xdrDecodeInt();
        if_oerrors = xdr.xdrDecodeInt();
        if_collisions = xdr.xdrDecodeInt();
        v_swtch = xdr.xdrDecodeInt();
        avenrun = xdr.xdrDecodeIntFixedVector(3);
        boottime = new rstat_timeval(xdr);
        curtime = new rstat_timeval(xdr);
        if_opackets = xdr.xdrDecodeInt();
    }

}
// End of statstime.java
