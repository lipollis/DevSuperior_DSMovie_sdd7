import './styles.css';

import { Link } from 'react-router-dom';
import {
    FaGithub,
    FaFacebook,
    FaInstagram,
    FaLinkedinIn,
    FaRegEnvelope,
} from 'react-icons/fa'; //yarn add react-icons

function Footer() {
    return (
        <>
            <footer className='footer' >
                <div className='caixa'></div>
                <div className='container-footer'>
                    <div>
                        <Link className=' ' to="https://github.com/lipollis" rel="noreferrer">
                            <FaGithub className='rede-social'/></Link>

                        <Link className=' ' to="https://www.instagram.com/alinepollis/" rel="noreferrer">
                            <FaInstagram className='rede-social'/></Link>

                        <Link className=' ' to="https://www.facebook.com/aline.pollis/" rel="noreferrer">
                            <FaFacebook className='rede-social'/></Link>

                        <Link className=' ' to="https://www.linkedin.com/in/alinepollisbeck/" rel="noreferrer">
                            <FaLinkedinIn className='rede-social'/></Link>

                        <Link className=' ' to="mailto:aline.pollis@hotmail.com" rel="noreferrer">
                            <FaRegEnvelope className='rede-social'/></Link>
                    </div>

                </div>
            </footer >
            <div className='rodape'><span >Aline Pollis</span></div>

        </>
    );
}

export default Footer;