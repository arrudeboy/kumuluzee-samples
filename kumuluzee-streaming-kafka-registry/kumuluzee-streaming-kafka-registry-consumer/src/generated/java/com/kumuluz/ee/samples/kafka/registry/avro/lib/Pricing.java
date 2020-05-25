/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kumuluz.ee.samples.kafka.registry.avro.lib;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Pricing extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8159164123532769464L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pricing\",\"namespace\":\"com.kumuluz.ee.samples.kafka.registry.avro.lib\",\"fields\":[{\"name\":\"price\",\"type\":\"string\"},{\"name\":\"priceExTax\",\"type\":\"string\"},{\"name\":\"basePrice\",\"type\":\"string\"},{\"name\":\"taxAmount\",\"type\":\"string\"},{\"name\":\"description\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Pricing> ENCODER =
      new BinaryMessageEncoder<Pricing>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Pricing> DECODER =
      new BinaryMessageDecoder<Pricing>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Pricing> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Pricing> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Pricing> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Pricing>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Pricing to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Pricing from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Pricing instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Pricing fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence price;
  @Deprecated public java.lang.CharSequence priceExTax;
  @Deprecated public java.lang.CharSequence basePrice;
  @Deprecated public java.lang.CharSequence taxAmount;
  @Deprecated public java.lang.CharSequence description;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Pricing() {}

  /**
   * All-args constructor.
   * @param price The new value for price
   * @param priceExTax The new value for priceExTax
   * @param basePrice The new value for basePrice
   * @param taxAmount The new value for taxAmount
   * @param description The new value for description
   */
  public Pricing(java.lang.CharSequence price, java.lang.CharSequence priceExTax, java.lang.CharSequence basePrice, java.lang.CharSequence taxAmount, java.lang.CharSequence description) {
    this.price = price;
    this.priceExTax = priceExTax;
    this.basePrice = basePrice;
    this.taxAmount = taxAmount;
    this.description = description;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return price;
    case 1: return priceExTax;
    case 2: return basePrice;
    case 3: return taxAmount;
    case 4: return description;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: price = (java.lang.CharSequence)value$; break;
    case 1: priceExTax = (java.lang.CharSequence)value$; break;
    case 2: basePrice = (java.lang.CharSequence)value$; break;
    case 3: taxAmount = (java.lang.CharSequence)value$; break;
    case 4: description = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.lang.CharSequence getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.lang.CharSequence value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'priceExTax' field.
   * @return The value of the 'priceExTax' field.
   */
  public java.lang.CharSequence getPriceExTax() {
    return priceExTax;
  }


  /**
   * Sets the value of the 'priceExTax' field.
   * @param value the value to set.
   */
  public void setPriceExTax(java.lang.CharSequence value) {
    this.priceExTax = value;
  }

  /**
   * Gets the value of the 'basePrice' field.
   * @return The value of the 'basePrice' field.
   */
  public java.lang.CharSequence getBasePrice() {
    return basePrice;
  }


  /**
   * Sets the value of the 'basePrice' field.
   * @param value the value to set.
   */
  public void setBasePrice(java.lang.CharSequence value) {
    this.basePrice = value;
  }

  /**
   * Gets the value of the 'taxAmount' field.
   * @return The value of the 'taxAmount' field.
   */
  public java.lang.CharSequence getTaxAmount() {
    return taxAmount;
  }


  /**
   * Sets the value of the 'taxAmount' field.
   * @param value the value to set.
   */
  public void setTaxAmount(java.lang.CharSequence value) {
    this.taxAmount = value;
  }

  /**
   * Gets the value of the 'description' field.
   * @return The value of the 'description' field.
   */
  public java.lang.CharSequence getDescription() {
    return description;
  }


  /**
   * Sets the value of the 'description' field.
   * @param value the value to set.
   */
  public void setDescription(java.lang.CharSequence value) {
    this.description = value;
  }

  /**
   * Creates a new Pricing RecordBuilder.
   * @return A new Pricing RecordBuilder
   */
  public static com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder newBuilder() {
    return new com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder();
  }

  /**
   * Creates a new Pricing RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Pricing RecordBuilder
   */
  public static com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder newBuilder(com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder other) {
    if (other == null) {
      return new com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder();
    } else {
      return new com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder(other);
    }
  }

  /**
   * Creates a new Pricing RecordBuilder by copying an existing Pricing instance.
   * @param other The existing instance to copy.
   * @return A new Pricing RecordBuilder
   */
  public static com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder newBuilder(com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing other) {
    if (other == null) {
      return new com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder();
    } else {
      return new com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder(other);
    }
  }

  /**
   * RecordBuilder for Pricing instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pricing>
    implements org.apache.avro.data.RecordBuilder<Pricing> {

    private java.lang.CharSequence price;
    private java.lang.CharSequence priceExTax;
    private java.lang.CharSequence basePrice;
    private java.lang.CharSequence taxAmount;
    private java.lang.CharSequence description;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.price)) {
        this.price = data().deepCopy(fields()[0].schema(), other.price);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.priceExTax)) {
        this.priceExTax = data().deepCopy(fields()[1].schema(), other.priceExTax);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.basePrice)) {
        this.basePrice = data().deepCopy(fields()[2].schema(), other.basePrice);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.taxAmount)) {
        this.taxAmount = data().deepCopy(fields()[3].schema(), other.taxAmount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.description)) {
        this.description = data().deepCopy(fields()[4].schema(), other.description);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Pricing instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.price)) {
        this.price = data().deepCopy(fields()[0].schema(), other.price);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.priceExTax)) {
        this.priceExTax = data().deepCopy(fields()[1].schema(), other.priceExTax);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.basePrice)) {
        this.basePrice = data().deepCopy(fields()[2].schema(), other.basePrice);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.taxAmount)) {
        this.taxAmount = data().deepCopy(fields()[3].schema(), other.taxAmount);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.description)) {
        this.description = data().deepCopy(fields()[4].schema(), other.description);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.lang.CharSequence getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder setPrice(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.price = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder clearPrice() {
      price = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'priceExTax' field.
      * @return The value.
      */
    public java.lang.CharSequence getPriceExTax() {
      return priceExTax;
    }


    /**
      * Sets the value of the 'priceExTax' field.
      * @param value The value of 'priceExTax'.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder setPriceExTax(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.priceExTax = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'priceExTax' field has been set.
      * @return True if the 'priceExTax' field has been set, false otherwise.
      */
    public boolean hasPriceExTax() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'priceExTax' field.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder clearPriceExTax() {
      priceExTax = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'basePrice' field.
      * @return The value.
      */
    public java.lang.CharSequence getBasePrice() {
      return basePrice;
    }


    /**
      * Sets the value of the 'basePrice' field.
      * @param value The value of 'basePrice'.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder setBasePrice(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.basePrice = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'basePrice' field has been set.
      * @return True if the 'basePrice' field has been set, false otherwise.
      */
    public boolean hasBasePrice() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'basePrice' field.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder clearBasePrice() {
      basePrice = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'taxAmount' field.
      * @return The value.
      */
    public java.lang.CharSequence getTaxAmount() {
      return taxAmount;
    }


    /**
      * Sets the value of the 'taxAmount' field.
      * @param value The value of 'taxAmount'.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder setTaxAmount(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.taxAmount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'taxAmount' field has been set.
      * @return True if the 'taxAmount' field has been set, false otherwise.
      */
    public boolean hasTaxAmount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'taxAmount' field.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder clearTaxAmount() {
      taxAmount = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'description' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescription() {
      return description;
    }


    /**
      * Sets the value of the 'description' field.
      * @param value The value of 'description'.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder setDescription(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.description = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'description' field has been set.
      * @return True if the 'description' field has been set, false otherwise.
      */
    public boolean hasDescription() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'description' field.
      * @return This builder.
      */
    public com.kumuluz.ee.samples.kafka.registry.avro.lib.Pricing.Builder clearDescription() {
      description = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Pricing build() {
      try {
        Pricing record = new Pricing();
        record.price = fieldSetFlags()[0] ? this.price : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.priceExTax = fieldSetFlags()[1] ? this.priceExTax : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.basePrice = fieldSetFlags()[2] ? this.basePrice : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.taxAmount = fieldSetFlags()[3] ? this.taxAmount : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.description = fieldSetFlags()[4] ? this.description : (java.lang.CharSequence) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Pricing>
    WRITER$ = (org.apache.avro.io.DatumWriter<Pricing>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Pricing>
    READER$ = (org.apache.avro.io.DatumReader<Pricing>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.price);

    out.writeString(this.priceExTax);

    out.writeString(this.basePrice);

    out.writeString(this.taxAmount);

    out.writeString(this.description);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.price = in.readString(this.price instanceof Utf8 ? (Utf8)this.price : null);

      this.priceExTax = in.readString(this.priceExTax instanceof Utf8 ? (Utf8)this.priceExTax : null);

      this.basePrice = in.readString(this.basePrice instanceof Utf8 ? (Utf8)this.basePrice : null);

      this.taxAmount = in.readString(this.taxAmount instanceof Utf8 ? (Utf8)this.taxAmount : null);

      this.description = in.readString(this.description instanceof Utf8 ? (Utf8)this.description : null);

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.price = in.readString(this.price instanceof Utf8 ? (Utf8)this.price : null);
          break;

        case 1:
          this.priceExTax = in.readString(this.priceExTax instanceof Utf8 ? (Utf8)this.priceExTax : null);
          break;

        case 2:
          this.basePrice = in.readString(this.basePrice instanceof Utf8 ? (Utf8)this.basePrice : null);
          break;

        case 3:
          this.taxAmount = in.readString(this.taxAmount instanceof Utf8 ? (Utf8)this.taxAmount : null);
          break;

        case 4:
          this.description = in.readString(this.description instanceof Utf8 ? (Utf8)this.description : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










