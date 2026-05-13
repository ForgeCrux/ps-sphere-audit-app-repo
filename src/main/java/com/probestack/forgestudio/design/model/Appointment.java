package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Appointment
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-13T04:05:50.787357823Z[GMT]")public class Appointment {

  private String appointmentId;

  private String patientId;

  private String doctorName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  public Appointment appointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
    return this;
  }

  /**
   * Get appointmentId
   * @return appointmentId
  */
    @Schema(name = "appointmentId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appointmentId")
  public String getAppointmentId() {
    return appointmentId;
  }

  public void setAppointmentId(String appointmentId) {
    this.appointmentId = appointmentId;
  }

  public Appointment patientId(String patientId) {
    this.patientId = patientId;
    return this;
  }

  /**
   * Get patientId
   * @return patientId
  */
    @Schema(name = "patientId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("patientId")
  public String getPatientId() {
    return patientId;
  }

  public void setPatientId(String patientId) {
    this.patientId = patientId;
  }

  public Appointment doctorName(String doctorName) {
    this.doctorName = doctorName;
    return this;
  }

  /**
   * Get doctorName
   * @return doctorName
  */
    @Schema(name = "doctorName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("doctorName")
  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }

  public Appointment date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @Valid   @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appointment appointment = (Appointment) o;
    return Objects.equals(this.appointmentId, appointment.appointmentId) &&
        Objects.equals(this.patientId, appointment.patientId) &&
        Objects.equals(this.doctorName, appointment.doctorName) &&
        Objects.equals(this.date, appointment.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appointmentId, patientId, doctorName, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appointment {\n");
    sb.append("    appointmentId: ").append(toIndentedString(appointmentId)).append("\n");
    sb.append("    patientId: ").append(toIndentedString(patientId)).append("\n");
    sb.append("    doctorName: ").append(toIndentedString(doctorName)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

