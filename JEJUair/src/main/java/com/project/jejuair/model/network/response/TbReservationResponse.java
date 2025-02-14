package com.project.jejuair.model.network.response;

import com.project.jejuair.model.entity.TbFlightSchedule;
import com.project.jejuair.model.entity.TbMember;
import com.project.jejuair.model.entity.TbPassenger;
import com.project.jejuair.model.enumclass.reservation.ResRoute;
import com.project.jejuair.model.enumclass.reservation.ResStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TbReservationResponse {
    private Long resIdx;
    private ResStatus resStatus;
    private LocalDateTime resRegDate;
    private ResRoute resRoute;

    private Long tbMemberMemIdx;
    private String memUserid;
    private String memKoLastname;
    private String memKoFirstname;
    private String memHp;
    private String memEmail;

    private Long tbFlightScheduleSchIdx;
    private String schAircraftName;
    private String schDeparture;
    private String schArrival;
    private String schDepartureDate;
    private String schArrivalDate;
    private String schDepartureTime;
    private String schArrivalTime;

    private List<TbPassengerResponse> tbPassengerResponseList;
}
