/*
 * Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package xp1;

import java.io.InputStream;
import java.io.Reader;

import javax.xml.stream.EventFilter;
import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLReporter;
import javax.xml.stream.XMLResolver;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.XMLEventAllocator;
import javax.xml.transform.Source;

public class XMLInputFactoryImpl extends XMLInputFactory {

    @Override
    public XMLStreamReader createXMLStreamReader(Reader reader) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLStreamReader createXMLStreamReader(Source source) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLStreamReader createXMLStreamReader(InputStream stream) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLStreamReader createXMLStreamReader(InputStream stream, String encoding)
            throws XMLStreamException {
        return null;
    }

    @Override
    public XMLStreamReader createXMLStreamReader(String systemId, InputStream stream)
            throws XMLStreamException {
        return null;
    }

    @Override
    public XMLStreamReader createXMLStreamReader(String systemId, Reader reader) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLEventReader createXMLEventReader(Reader reader) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLEventReader createXMLEventReader(String systemId, Reader reader) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLEventReader createXMLEventReader(XMLStreamReader reader) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLEventReader createXMLEventReader(Source source) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLEventReader createXMLEventReader(InputStream stream) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLEventReader createXMLEventReader(InputStream stream, String encoding) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLEventReader createXMLEventReader(String systemId, InputStream stream) throws XMLStreamException {
        return null;
    }

    @Override
    public XMLStreamReader createFilteredReader(XMLStreamReader reader, StreamFilter filter)
            throws XMLStreamException {
        return null;
    }

    @Override
    public XMLEventReader createFilteredReader(XMLEventReader reader, EventFilter filter)
            throws XMLStreamException {
        return null;
    }

    @Override
    public XMLResolver getXMLResolver() {
        return null;
    }

    @Override
    public void setXMLResolver(XMLResolver resolver) {

    }

    @Override
    public XMLReporter getXMLReporter() {
        return null;
    }

    @Override
    public void setXMLReporter(XMLReporter reporter) {

    }

    @Override
    public void setProperty(String name, Object value) throws IllegalArgumentException {

    }

    @Override
    public Object getProperty(String name) throws IllegalArgumentException {
        return null;
    }

    @Override
    public boolean isPropertySupported(String name) {
        return false;
    }

    @Override
    public void setEventAllocator(XMLEventAllocator allocator) {

    }

    @Override
    public XMLEventAllocator getEventAllocator() {
        return null;
    }

}
